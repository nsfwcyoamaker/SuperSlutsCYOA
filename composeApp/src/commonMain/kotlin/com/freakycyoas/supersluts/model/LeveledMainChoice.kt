package com.freakycyoas.supersluts.model

interface LeveledMainChoice: MainChoice {
    fun ofLevel(level: ChoiceLevel): LeveledMainChoice
    val levels: List<ChoiceLevel>
    val selectedLevel: Int?
}
