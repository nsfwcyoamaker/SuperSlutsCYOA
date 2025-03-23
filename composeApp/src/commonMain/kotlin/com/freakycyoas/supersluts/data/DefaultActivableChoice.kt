package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.model.ActivableItem
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.utils.containsAny
import com.freakycyoas.supersluts.utils.containsNone

@Immutable
@Stable
class DefaultActivableChoice(
    @Stable val requires: (() -> List<Choice>)? = null,
    @Stable val requiresAll: Boolean = true,
    @Stable val incompatibleWith: (() -> List<Choice>)? = null,
): ActivableItem {
    @Stable override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean {
        if(requires == null && incompatibleWith == null) return true

        val requirements = requires?.invoke() ?: emptyList()
        val incompatibilities = incompatibleWith?.invoke() ?: emptyList()

        if(requirements.isEmpty() && incompatibilities.isEmpty()) return true

        val requirementsMet = if (requiresAll)
            allSelectedChoices.matchesAll(requirements)
        else
            allSelectedChoices.matchesAny(requirements)

        return (requirementsMet) && allSelectedChoices.containsNone(incompatibilities)
    }

    private fun List<Choice>.matchesAll(others: List<Choice>): Boolean {
        val simple = others.filter { it !is LeveledMainChoice }
        val simpleRequirementsMatched = this.containsAll(simple)

        val leveled = others.filterIsInstance<LeveledMainChoice>()

        if(leveled.isEmpty()) return simpleRequirementsMatched

        val leveled_levelBased = leveled.mapNotNull { choice -> choice.selectedLevel?.let { level -> level to choice } }
        val leveled_notLevelBased = leveled.filter { choice -> choice.selectedLevel == null }

        val levelBasedMatched = if(leveled_levelBased.isNotEmpty()) {
            leveled_levelBased.all { (level, choice) ->
                ((this.singleOrNull { it::class == choice::class } as? LeveledMainChoice)?.selectedLevel ?: -1) >= level
            }
        } else true

        val notLevelBasedMatched = if(leveled_notLevelBased.isNotEmpty()) {
            leveled_notLevelBased.all { choice ->
                this.singleOrNull { it::class == choice::class } != null
            }
        } else true

        return simpleRequirementsMatched && levelBasedMatched && notLevelBasedMatched
    }

    private fun List<Choice>.matchesAny(others: List<Choice>): Boolean {
        val simple = others.filter { it !is LeveledMainChoice }
        val simpleRequirementsMatched = this.containsAny(simple)

        if(simple.isNotEmpty() && simpleRequirementsMatched) return true

        val leveled = others.filterIsInstance<LeveledMainChoice>()

        if(leveled.isEmpty()) return false

        val leveled_levelBased = leveled.mapNotNull { choice -> choice.selectedLevel?.let { level -> level to choice } }
        val leveled_notLevelBased = leveled.filter { choice -> choice.selectedLevel == null }

        if(leveled_levelBased.isNotEmpty()) {
            val levelBasedMatched = leveled_levelBased.any { (level, choice) ->
                ((this.singleOrNull { it::class == choice::class } as? LeveledMainChoice)?.selectedLevel ?: -1) >= level
            }
            if(levelBasedMatched) return true
        }

        if(leveled_levelBased.isNotEmpty()) {
            val notLevelBasedMatched = leveled_notLevelBased.any { choice ->
                this.singleOrNull { it::class == choice::class } != null
            }
            if(notLevelBasedMatched) return true
        }

        return false
    }
}