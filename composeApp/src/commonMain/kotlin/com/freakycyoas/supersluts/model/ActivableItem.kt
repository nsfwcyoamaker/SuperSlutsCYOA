package com.freakycyoas.supersluts.model

interface ActivableItem {
    fun canBeTaken(allSelectedChoices: List<Choice>): Boolean
}