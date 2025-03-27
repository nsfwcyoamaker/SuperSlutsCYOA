package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.MultiselectChoicesGroup
import com.freakycyoas.supersluts.model.MultiselectMainChoice

class DefaultMultiselectChoicesGroup(override val choices: List<MultiselectMainChoice>): MultiselectChoicesGroup {
    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choices.withDrawbacks.any { it::class == choice::class })

        return when {
            choice is MultiselectMainChoice -> {
                val choiceInState = (allSelectedChoices.singleOrNull { it::class == choice::class } as? MultiselectMainChoice)

                if(choiceInState != null) {
                    val selectionInState = choiceInState.getSelectedChoices(allSelectedChoices)
                    val newSelection = choice.getSelectedChoices(allSelectedChoices)

                    if(selectionInState == newSelection) {
                        allSelectedChoices.filter { it::class != choice::class }
                    } else {
                        allSelectedChoices.filter { it::class != choice::class }.plus(choice)
                    }
                } else {
                    allSelectedChoices.plus(choice)
                }
            }

            choice is DrawbackChoice && allSelectedChoices.contains(choice) -> allSelectedChoices.minus(choice)
            choice is DrawbackChoice && !allSelectedChoices.contains(choice) -> allSelectedChoices.plus(choice)
            else -> allSelectedChoices.plus(choice)
        }
    }
}
