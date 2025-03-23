package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_CHUBBY

@Immutable
@Stable
object BodyFigureChubby: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_CHUBBY,
    name = "CHUBBY",
    text = AnnotatedString("How about some jelly on the belly? You won’t look obese, you’ll just look jiggly and fluffy in all the right places."),
    powerPoints = 0.pp,
    incompatibleWith = { listOf(BodyFigureWorkoutWhore) },
    linkedDrawbackChoice = { BodyFigureFatDistribution },
)