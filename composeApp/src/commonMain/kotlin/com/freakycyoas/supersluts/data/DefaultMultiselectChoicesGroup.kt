package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.MultiselectChoicesGroup
import com.freakycyoas.supersluts.model.MultiselectMainChoice

class DefaultMultiselectChoicesGroup(override val choices: List<MultiselectMainChoice>): MultiselectChoicesGroup {
    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choices.withDrawbacks.any { it::class == choice::class })

        return when {
            choice is MultiselectMainChoice && (allSelectedChoices.singleOrNull { it::class == choice::class } as? MultiselectMainChoice)?.selectedChoices.let { it != null && it == choice.selectedChoices } -> allSelectedChoices.filter { it::class != choice::class }
            choice is MultiselectMainChoice && (allSelectedChoices.singleOrNull { it::class == choice::class } as? MultiselectMainChoice)?.selectedChoices.let { it != null && it != choice.selectedChoices } -> allSelectedChoices.filter { it::class != choice::class }.plus(choice)
            choice is MultiselectMainChoice && allSelectedChoices.none { it::class == choice::class } -> allSelectedChoices.plus(choice)

            choice is DrawbackChoice && allSelectedChoices.contains(choice) -> allSelectedChoices.minus(choice)
            choice is DrawbackChoice && !allSelectedChoices.contains(choice) -> allSelectedChoices.plus(choice)
            else -> allSelectedChoices.plus(choice)
        }
    }
}
