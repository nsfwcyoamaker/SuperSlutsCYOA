package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.LeveledChoicesGroup
import com.freakycyoas.supersluts.model.LeveledMainChoice

class DefaultLeveledChoicesGroup(override val choices: List<LeveledMainChoice>): LeveledChoicesGroup {
    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choices.withDrawbacks.any { it::class == choice::class })
        if(choice is LeveledMainChoice) { require(choice.selectedLevel != null) }

        return when {
            choice is LeveledMainChoice && (allSelectedChoices.singleOrNull { it::class == choice::class } as? LeveledMainChoice)?.selectedLevel.let { it != null && it == choice.selectedLevel } -> allSelectedChoices.filter { it::class != choice::class }
            choice is LeveledMainChoice && (allSelectedChoices.singleOrNull { it::class == choice::class } as? LeveledMainChoice)?.selectedLevel.let { it != null && it != choice.selectedLevel } -> allSelectedChoices.filter { it::class != choice::class }.plus(choice)
            choice is LeveledMainChoice && allSelectedChoices.none { it::class == choice::class } -> allSelectedChoices.plus(choice)

            choice is DrawbackChoice && allSelectedChoices.contains(choice) -> allSelectedChoices.minus(choice)
            choice is DrawbackChoice && !allSelectedChoices.contains(choice) -> allSelectedChoices.plus(choice)
            else -> allSelectedChoices.plus(choice)
        }
    }
}