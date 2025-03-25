package com.freakycyoas.supersluts.model

interface PointTransferChoicesGroup {
    val choices: List<PointTransferMainChoice>
    fun onChoiceSelected(choice: PointTransferMainChoice, allSelectedChoices: List<Choice>): List<Choice>
}