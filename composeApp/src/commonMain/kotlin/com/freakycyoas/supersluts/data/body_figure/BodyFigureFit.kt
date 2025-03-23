package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_FIT

@Immutable
@Stable
object BodyFigureFit: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_FIT,
    name = "FIT",
    text = AnnotatedString("Would you like to have a slim, athletic, well-toned body? You will look strong and yet agile."),
    powerPoints = 1.pp,
    linkedDrawbackChoice = { BodyFigureWorkoutWhore },
)