package com.freakycyoas.supersluts.model

interface MultiselectChoicesGroup {
    val choices: List<MultiselectMainChoice>
    fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice>
}