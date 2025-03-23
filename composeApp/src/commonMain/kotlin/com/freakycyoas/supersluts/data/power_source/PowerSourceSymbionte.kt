package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_SYMBIONTE

@Immutable
@Stable
object PowerSourceSymbionte: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.power_source_SYMBIONTE,
    name = "SYMBIONTE",
    text = buildAnnotatedString {
        append("Instead of choosing an object, you will get a symbiote, you may choose its color and general personality. If lost or stolen it will return to you after 1 month. A Symbiote is a telepathic slime creature, which will wrap itself around it's host's body and feed on its host’s sexual pleasure. It will regularly stimulate you in order to sustain itself. Using your powers will make it hungry. It will be able to transform into any type of clothing but it can’t change it’s original color. You also gain ")
        withStyle(goldPointsStyle) { append("10 Gold Points") }
        append(" which you can only spend in the Outfit Features section.")
    },
    givenPowerPoints = (-3).pp,
    linkedMainChoice = { PowerSourceObject },
    requires = { listOf(PowerSourceObject) },
    incompatibleWith = { listOf(PowerSourceCyborg) }
) {
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 10.gp
}