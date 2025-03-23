package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.GoldPointsModifier
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.superheroines.SuperheroinesChoicesGroup
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.sponsor_WALT_DISNEY

object SponsorWaltDisney: MainChoice by SimpleMainChoice(
    image = Res.drawable.sponsor_WALT_DISNEY,
    name = "WALT DISNEY",
    text = buildAnnotatedString {
        append("Walt Disney is an American multinational mass media and entertainment conglomerate. If I remember correctly Disney exists in your old universe, so you should be pretty familiar with their brand. Anyways Walt Disney is looking for family-friendly superheroes to sponsor. All options in the Superheroine section will cost ")
        withStyle(goldPointsStyle) { append("2 Gold Points") }
        append(" less.")
    },
    goldPoints = 20.gp
), GoldPointsModifier {
    override val priority: Int = 0

    override fun modifyGrantedGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceGoldPoints: GoldPoints): GoldPoints {
        if(choice !in SuperheroinesChoicesGroup.choices) return choiceGoldPoints
        return choiceGoldPoints.amount.let { amount ->
            if(amount < 0) {
                (amount + 2).coerceAtLeast(0)
            } else {
                amount
            }
        }.gp
    }

    override fun modifyGrantedOutfitGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceOutfitGoldPoints: GoldPoints): GoldPoints = choiceOutfitGoldPoints
}