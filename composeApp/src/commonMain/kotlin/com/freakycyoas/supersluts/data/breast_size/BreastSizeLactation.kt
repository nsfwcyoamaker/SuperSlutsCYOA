package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_LACTATION

@Immutable
@Stable
object BreastSizeLactation: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.breast_size_LACTATION,
    name = "LACTATION",
    text = AnnotatedString("You’ll need to milk your breasts on a daily basis or your tits are going to swell and feel sore."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeBigTits },
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.breast_size.BreastSizeFlat) },
)