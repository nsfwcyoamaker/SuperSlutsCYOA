package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_BASIC_BITCH

@Immutable
@Stable
object BodyFigureBasicBitch: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_BASIC_BITCH,
    name = "BASIC BITCH",
    text = AnnotatedString("You gain the taste of a basic bitch. For example, you will only enjoy mainstream movies and missionary is now your favorite sex position, anything beyond missionary is disgusting to you, especially anal."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { BodyFigureAverage },
)