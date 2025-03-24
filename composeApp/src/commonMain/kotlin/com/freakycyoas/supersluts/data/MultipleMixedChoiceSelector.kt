package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.*

class MultipleMixedChoiceSelector(override val choices: List<MainChoice>): ChoicesGroup {
    private val main = MultipleChoiceSelector(choices)
    private val leveled = DefaultLeveledChoicesGroup(choices.filterIsInstance<LeveledMainChoice>())
    private val multibuy = DefaultMultibuyChoicesGroup(choices.filterIsInstance<MultibuyMainChoice>())
    private val multiselect = DefaultMultiselectChoicesGroup(choices.filterIsInstance<MultiselectMainChoice>())

    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        return when {
            choice is LeveledMainChoice -> {
                leveled.onChoiceSelected(choice, allSelectedChoices)
            }
            choice is MultibuyMainChoice -> {
                multibuy.onChoiceSelected(choice, allSelectedChoices)
            }
            choice is MultiselectMainChoice -> {
                multiselect.onChoiceSelected(choice, allSelectedChoices)
            }
            else -> {
                main.onChoiceSelected(choice, allSelectedChoices)
            }
        }
    }
}
