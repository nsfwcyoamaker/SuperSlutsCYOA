package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.FatePointsModifier
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.fate.FateChoicesGroup
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.fatePointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.sponsor_NO_SPONSOR

object SponsorNoSponsor: MainChoice by SimpleMainChoice(
    image = Res.drawable.sponsor_NO_SPONSOR,
    name = "NO SPONSOR",
    text = buildAnnotatedString {
        append("You will have no big company to sponsor you. So you’ll basically have to be your own sponsor. Well, good luck with that... On the bright side, you will have a lot more freedom and won’t have a giant corporation that bosses you around. Your fate and fortune will be in your own hands. Every option in the Fate section will grant you ")
        withStyle(fatePointsStyle) { append("3 additional Fate Points") }
        append(".")
    },
    goldPoints = 0.gp,
), FatePointsModifier {
    override val priority: Int = 0

    override fun modifyGrantedFatePoints(allSelectedChoices: List<Choice>, choice: Choice, choiceFatePoints: FatePoints): FatePoints {
        if(choice !in com.freakycyoas.supersluts.data.fate.FateChoicesGroup.choices) return choiceFatePoints
        return (choiceFatePoints.amount + 3).fp
    }
}