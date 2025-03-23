package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.ChoicesGroup
import com.freakycyoas.supersluts.model.MainChoice

class MultipleChoiceSelector(override val choices: List<MainChoice>): ChoicesGroup {
    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choice in choices.withDrawbacks)

        return when {
            allSelectedChoices.contains(choice) -> allSelectedChoices.minus(choice)
            else -> allSelectedChoices.plus(choice)
        }
    }
}
