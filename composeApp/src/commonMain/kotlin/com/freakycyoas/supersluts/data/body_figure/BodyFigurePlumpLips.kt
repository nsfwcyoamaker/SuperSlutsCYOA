package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_PLUMP_LIPS

@Immutable
@Stable
object BodyFigurePlumpLips: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_PLUMP_LIPS,
    name = "PLUMP LIPS",
    text = AnnotatedString("How about some big plump pillowy kissable lips? They will wrap around a cock nicely, perfect for cock sucking!"),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { BodyFigureCurvacious },
)