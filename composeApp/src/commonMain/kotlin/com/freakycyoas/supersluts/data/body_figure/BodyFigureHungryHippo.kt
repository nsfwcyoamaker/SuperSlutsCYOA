package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_HUNGRY_HIPPO

@Immutable
@Stable
object BodyFigureHungryHippo: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_HUNGRY_HIPPO,
    name = "HUNGRY HIPPO",
    text = AnnotatedString("You will need to eat 5 times as much as a regular human of your size and you also eat like a total slob. You’ll spill food and drink everywhere."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { BodyFigureFat },
)