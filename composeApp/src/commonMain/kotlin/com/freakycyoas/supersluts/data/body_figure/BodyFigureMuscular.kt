package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_MUSCULAR

@Immutable
@Stable
object BodyFigureMuscular: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_MUSCULAR,
    name = "MUSCULAR",
    text = AnnotatedString("How about some big bulging muscles? How about a lot of big bulging muscles? I could give your body a herculean build that radiates strength and power."),
    powerPoints = 2.pp,
    linkedDrawbackChoice = { BodyFigureHairy },
)