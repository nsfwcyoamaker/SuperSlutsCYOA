package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.goldPointsStyle
import com.freakycyoas.supersluts.theme.prisonPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_PRIVATE_PRISON

@Immutable
@Stable
class PerkPrivatePrison(override val amountTransferred: Int? = null): PointTransferMainChoice, MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_PRIVATE_PRISON,
    name = "PRIVATE PRISON",
    text = buildAnnotatedString {
        append("Throwing supervillains into prison might feel a bit unsatisfying. So why not run your own prison and make sure the villains you catch get what they deserve? Create your own prison using the Super Prison CYOA, you must choose to be the warden. If you want more ")
        withStyle(prisonPointsStyle) { append("Prison Points") }
        append(" for your prison you can convert ")
        withStyle(goldPointsStyle) { append("Gold Points") }
        append(" into ")
        withStyle(prisonPointsStyle) { append("Prison Points") }
        append(" at a rate of ")
        withStyle(goldPointsStyle) { append("1 Gold Point") }
        append(" to ")
        withStyle(prisonPointsStyle) { append("3 Prison Points") }
        append(".")
    },
    incompatibleWith = { listOf(SponsorWaltDisney) },
    goldPoints = (-20).gp
) {
    override fun ofAmount(newAmount: Int): PointTransferMainChoice {
        return PerkPrivatePrison(newAmount)
    }

    override fun grantedPoints(): Points {
        return ((amountTransferred ?: 0) * 3).prisonPoints
    }

    override fun consumedPoints(): Points {
        return (amountTransferred ?: 0).gp
    }

    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        return (-20).gp + (-(amountTransferred ?: 0)).gp
    }
}