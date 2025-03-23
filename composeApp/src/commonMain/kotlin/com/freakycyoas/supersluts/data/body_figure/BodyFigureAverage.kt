package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_AVERAGE

@Immutable
@Stable
object BodyFigureAverage: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_AVERAGE,
    name = "AVERAGE",
    text = AnnotatedString("I call this body type the average body type since most people have this kind of body shape. But trust me, honey, I will make you look anything but average."),
    powerPoints = 0.pp,
    linkedDrawbackChoice = { BodyFigureBasicBitch },
)