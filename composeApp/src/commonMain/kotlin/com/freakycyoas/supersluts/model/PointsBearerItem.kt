package com.freakycyoas.supersluts.model

interface PointsBearerItem {
    fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints
    fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints
    fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints
    fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints
}