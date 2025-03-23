package com.freakycyoas.supersluts.model

interface MultiselectMainChoice: MainChoice {
    val selectedChoices: List<Choice>

    fun getPossibleSelections(allChoice: List<Choice>): List<Choice>

    fun ofSelections(choices: List<Choice>): MultiselectMainChoice
}
