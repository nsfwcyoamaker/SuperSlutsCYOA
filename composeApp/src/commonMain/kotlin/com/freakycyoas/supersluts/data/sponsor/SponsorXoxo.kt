package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.GoldPointsModifier
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.contracts.ContractsChoicesGroup
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.sponsor_XOXO

object SponsorXoxo: MainChoice by SimpleMainChoice(
    image = Res.drawable.sponsor_XOXO,
    name = "XOXO",
    text = buildAnnotatedString {
        append("XOXO is a company that is entirely built around the idea of monetizing superheroes and you know what they say, sex sells. Nothing is too extreme for them, superhero porn and superhero prostitution are just some of the things they supply. Being a XOXO sponsored superhero will come attached with a lot of stigma, but you will have more opportunities to earn money. Every option in the Contracts section will grant you ")
        withStyle(goldPointsStyle) { append("1 additional Gold Point") }
        append(".")
    },
    goldPoints = 5.gp,
), GoldPointsModifier {
    override val priority: Int = 0

    override fun modifyGrantedGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceGoldPoints: GoldPoints): GoldPoints {
        if(choice !in com.freakycyoas.supersluts.data.contracts.ContractsChoicesGroup.choices) return choiceGoldPoints
        return (choiceGoldPoints.amount + 1).gp
    }

    override fun modifyGrantedOutfitGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceOutfitGoldPoints: GoldPoints): GoldPoints = choiceOutfitGoldPoints
}