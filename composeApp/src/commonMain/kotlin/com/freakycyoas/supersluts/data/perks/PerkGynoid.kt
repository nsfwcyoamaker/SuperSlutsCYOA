package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.customizationPointsStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_GYNOID

private val baseCost = (-8).gp

@Immutable
@Stable
class PerkGynoid(override val amountTransferred: Int? = null): PointTransferMainChoice, MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_GYNOID,
    name = "GYNOID",
    text = buildAnnotatedString {
        append("Ever wanted to own a hot female android? Well, today is your lucky day! Just fill in this form and you can have your own custom-built gynoid! You could use her as a maid, sidekick, sex robot or whatever you want really. Create your gynoid using the Dibella Corp CYOA, you must choose to get the gynoid and you can't purchase Hacking. You can convert ")
        withStyle(goldPointsStyle) { append("Gold Points") }
        append(" into ")
        withStyle(customizationPointsStyle) { append("Customization points") }
        append(" at a rate of ")
        withStyle(goldPointsStyle) { append("1 Gold Point") }
        append(" to ")
        withStyle(customizationPointsStyle) { append("2 Customization points") }
        append(".")
    },
    incompatibleWith = { listOf(SponsorWaltDisney) },
    goldPoints = baseCost,
) {
    override fun ofAmount(newAmount: Int): PointTransferMainChoice {
        return PerkGynoid(newAmount)
    }

    override fun grantedPoints(): CustomizationPoints {
        return ((amountTransferred ?: 0) * 2).customizationPoints
    }

    override fun consumedPoints(): GoldPoints {
        return (amountTransferred ?: 0).gp
    }

    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        return baseCost + consumedPoints()
    }
}