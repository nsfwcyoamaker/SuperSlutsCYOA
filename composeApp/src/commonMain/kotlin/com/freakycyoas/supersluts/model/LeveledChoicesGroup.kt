package com.freakycyoas.supersluts.model

interface LeveledChoicesGroup {
    val choices: List<LeveledMainChoice>
    fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice>
}