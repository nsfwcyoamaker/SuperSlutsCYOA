package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_EROGENOUS_NIPPLES

@Immutable
@Stable
object BreastSizeErogenousNipples: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.breast_size_EROGENOUS_NIPPLES,
    name = "EROGENOUS NIPPLES",
    text = AnnotatedString("Your nipples are now really sensitive and an erogenous zone. Continuous stimulation will make you climax. I recommend wearing pasties over your nipples to keep your nipples from rubbing against your bra."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeMediumTits }
)