package com.freakycyoas.supersluts.model

interface MultibuyChoicesGroup {
    val choices: List<MultibuyMainChoice>
    fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice>
}