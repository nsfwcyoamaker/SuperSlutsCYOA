package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.LeveledChoicesGroup

@Stable
@Immutable
class MinionPowersChoicesGroup(summonMinionPowerLevel: Int): LeveledChoicesGroup {
    @Stable override val choices: List<MinionPower> = PowersChoicesGroup.choices.filter { it::class != PowersSummonMinion::class }.map { MinionPower(it, summonMinionPowerLevel) }
    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choice is MinionPower)
        require(choice.selectedLevel != null)

        val powerInSelectedList = allSelectedChoices
            .filterIsInstance<MinionPower>()
            .singleOrNull { it.power::class == choice.power::class }
            ?: return allSelectedChoices.plus(choice)

        val selectedMinusCurrent = allSelectedChoices.minus(powerInSelectedList)

        val currentLevel = powerInSelectedList.selectedLevel

        return if(currentLevel != null && currentLevel == choice.selectedLevel) {
            selectedMinusCurrent
        } else {
            selectedMinusCurrent.plus(choice)
        }
    }
}