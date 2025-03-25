package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.PointTransferChoicesGroup
import com.freakycyoas.supersluts.model.PointTransferMainChoice

class DefaultPointTransferChoicesGroup(override val choices: List<PointTransferMainChoice>): PointTransferChoicesGroup {
    override fun onChoiceSelected(choice: PointTransferMainChoice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choices.any { it::class == choice::class })

        val current = allSelectedChoices.singleOrNull { it::class == choice::class } as? PointTransferMainChoice
        val clearedList = allSelectedChoices.filter { it::class != choice::class }

        return when {
            choice.amountTransferred == null && current == null -> clearedList.plus(choice)
            choice.amountTransferred == null && current != null -> clearedList

            choice.amountTransferred != null && current == null -> clearedList.plus(choice)
            choice.amountTransferred != null && current != null && choice.amountTransferred == current.amountTransferred -> clearedList
            choice.amountTransferred != null && current != null && choice.amountTransferred != current.amountTransferred -> clearedList.plus(choice)
            else -> { allSelectedChoices }
        }
    }
}
