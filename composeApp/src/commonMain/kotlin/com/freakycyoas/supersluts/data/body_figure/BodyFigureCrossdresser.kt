package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_CROSSDRESSER

@Immutable
@Stable
object BodyFigureCrossdresser: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_CROSSDRESSER,
    name = "CROSSDRESSER",
    text = AnnotatedString("Whenever you wear clothes designed for your gender you will feel super uncomfortable. You will only want to wear the opposite gender’s clothes."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { BodyFigureAndrogynous },
)