package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.MultibuyChoicesGroup
import com.freakycyoas.supersluts.model.MultibuyMainChoice

class DefaultMultibuyChoicesGroup(override val choices: List<MultibuyMainChoice>): MultibuyChoicesGroup {
    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choices.withDrawbacks.any { it::class == choice::class })

        return when {
            choice is MultibuyMainChoice && (allSelectedChoices.singleOrNull { it::class == choice::class } as? MultibuyMainChoice)?.boughtTimes.let { it != null && it == choice.boughtTimes } -> allSelectedChoices.filter { it::class != choice::class }
            choice is MultibuyMainChoice && (allSelectedChoices.singleOrNull { it::class == choice::class } as? MultibuyMainChoice)?.boughtTimes.let { it != null && it != choice.boughtTimes } -> allSelectedChoices.filter { it::class != choice::class }.plus(choice)
            choice is MultibuyMainChoice && allSelectedChoices.none { it::class == choice::class } -> allSelectedChoices.plus(choice)

            choice is DrawbackChoice && allSelectedChoices.contains(choice) -> allSelectedChoices.minus(choice)
            choice is DrawbackChoice && !allSelectedChoices.contains(choice) -> allSelectedChoices.plus(choice)
            else -> allSelectedChoices.plus(choice)
        }
    }
}