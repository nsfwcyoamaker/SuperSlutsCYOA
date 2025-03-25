package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_SWITCH

@Immutable
@Stable
object BodySizeSwitch: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_size_SWITCH,
    name = "SWITCH",
    text = AnnotatedString("You will randomly switch between being super dominant and confident to being super submissive and meek. The change can happen at any time but it will have a tendency to happen when there is a comedic effect to it."),
    givenPowerPoints = 10.pp,
    incompatibleWith = { listOf(
        BodySizeSubmissive,
        BodySizeDominant
    ) },
    linkedMainChoice = { BodySizeAverage }
)