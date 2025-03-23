package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.MultipleSpanDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_BREAST_ENVY

@Immutable
@Stable
object BreastSizeBreastEnvy: DrawbackChoice by MultipleSpanDrawbackChoice(
    image = Res.drawable.breast_size_BREAST_ENVY,
    name = "BREAST ENVY",
    text = AnnotatedString("You’re going to be super jealous of girls with bigger boobs than you. Watching their bigger bouncier tits jiggle in front of you will make you angry, envious and extremely insecure about your own tits. The bigger the tits are the bigger your reaction will be."),
    givenPowerPoints = 10.pp,
    requires = { listOf(
        com.freakycyoas.supersluts.data.breast_size.BreastSizeFlat,
        com.freakycyoas.supersluts.data.breast_size.BreastSizeSmallTits,
        com.freakycyoas.supersluts.data.breast_size.BreastSizeMediumTits
    ) },
    requiresAll = false,
    linkedMainChoices = { listOf(
        com.freakycyoas.supersluts.data.breast_size.BreastSizeFlat,
        com.freakycyoas.supersluts.data.breast_size.BreastSizeSmallTits
    ) }
)