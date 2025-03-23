package com.freakycyoas.supersluts.model

interface ChoicesGroup {
    val choices: List<MainChoice>
    fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice>
}