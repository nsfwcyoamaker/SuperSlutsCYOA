package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_WORKOUT_WHORE

@Immutable
@Stable
object BodyFigureWorkoutWhore: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_WORKOUT_WHORE,
    name = "WORKOUT WHORE",
    text = AnnotatedString("Now you will need to exercise at least 5 hours per week to maintain your body figure. Working out will always make you really horny."),
    givenPowerPoints = 8.pp,
    incompatibleWith = { listOf(BodyFigureChubby, BodyFigureFat, BodyFigureFatDistribution) },
    linkedMainChoice = { BodyFigureFit },
)