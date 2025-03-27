package com.freakycyoas.supersluts.model

interface MultiselectMainChoice: MainChoice {
    fun getSelectedChoices(allChoice: List<Choice>): List<Choice>

    fun getPossibleSelections(allChoice: List<Choice>): List<Choice>
}
