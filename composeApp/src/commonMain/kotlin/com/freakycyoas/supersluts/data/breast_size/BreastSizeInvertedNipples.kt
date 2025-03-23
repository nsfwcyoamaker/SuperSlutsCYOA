package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_INVERTED_NIPPLES

@Immutable
@Stable
object BreastSizeInvertedNipples: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.breast_size_INVERTED_NIPPLES,
    name = "INVERTED NIPPLES",
    text = AnnotatedString("Whenever your nipples are not erect their inverted, hidden inside your big fat tiddies!"),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeSuperTits },
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.breast_size.BreastSizeFlat) }
)