package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_FUCKABLE_NIPPLES

@Immutable
@Stable
object BreastSizeFuckableNipples: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.breast_size_FUCKABLE_NIPPLES,
    name = "FUCKABLE NIPPLES",
    text = AnnotatedString("Your nipples are stretchy enough to be fuckable and oh boy it will feel good to fuck them!"),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeLargeTits },
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.breast_size.BreastSizeFlat) }
)