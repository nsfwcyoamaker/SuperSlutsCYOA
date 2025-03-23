package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.PowerPointsModifier
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.powerPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.sponsor_DAWN_GENETICS

object SponsorDawnGenetics: MainChoice by SimpleMainChoice(
    image = Res.drawable.sponsor_DAWN_GENETICS,
    name = "DAWN GENETICS",
    text = buildAnnotatedString {
        append("To say that Dawn Genetics is one of the leading scientific companies in the fields of genetics would be an understatement. They are decades of research ahead of their competitors. Dawn Genetics will do just about anything to further their scientific knowledge short of breaking the law. To them, everything could be justified as long as it’s done in the name of science. Connected drawbacks will grant you ")
        withStyle(powerPointsStyle) { append("1") }
        append(" additional ")
        withStyle(powerPointsStyle) { append("Power Point") }
        append(".")
    },
    goldPoints = 10.gp
), PowerPointsModifier {
    override val priority: Int = 0

    @Stable override fun modifyGrantedPowerPoints(allSelectedChoices: List<Choice>, choice: Choice, choicePowerPoints: PowerPoints): PowerPoints {
        if(choice !is DrawbackChoice) return choicePowerPoints

        return if(allSelectedChoices.any { it::class in choice.getLinkedMainChoices() }) {
            (choicePowerPoints.amount + 1).pp
        } else {
            choicePowerPoints
        }
    }
}