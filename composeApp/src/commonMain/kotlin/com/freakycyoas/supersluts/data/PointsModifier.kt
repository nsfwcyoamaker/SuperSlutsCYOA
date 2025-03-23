package com.freakycyoas.supersluts.data

import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.FatePoints
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.PowerPoints

interface PowerPointsModifier {
    val priority: Int
    fun modifyGrantedPowerPoints(allSelectedChoices: List<Choice>, choice: Choice, choicePowerPoints: PowerPoints): PowerPoints
}

interface GoldPointsModifier {
    val priority: Int
    fun modifyGrantedGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceGoldPoints: GoldPoints): GoldPoints
    fun modifyGrantedOutfitGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceOutfitGoldPoints: GoldPoints): GoldPoints
}

interface FatePointsModifier {
    val priority: Int
    fun modifyGrantedFatePoints(allSelectedChoices: List<Choice>, choice: Choice, choiceFatePoints: FatePoints): FatePoints
}