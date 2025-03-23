package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_HAIRY

@Immutable
@Stable
object BodyFigureHairy: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_HAIRY,
    name = "HAIRY",
    text = AnnotatedString("Your crotch and armpits are hairy. If you cut or remove any hair from these regions it will instantly grow back."),
    givenPowerPoints = 5.pp,
    incompatibleWith = { listOf(BodyFigureHairless) },
    linkedMainChoice = { BodyFigureMuscular },
)
