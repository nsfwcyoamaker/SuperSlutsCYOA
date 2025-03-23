package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_FRECKLES

@Immutable
@Stable
object BodyFigureFreckles: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_FRECKLES,
    name = "FRECKLES",
    text = AnnotatedString("You have cute little freckles decorating your face and body! With all those spots you’re almost like a human jaguar, rawr!"),
    givenPowerPoints = 3.pp,
    linkedMainChoice = { BodyFigurePetit },
)