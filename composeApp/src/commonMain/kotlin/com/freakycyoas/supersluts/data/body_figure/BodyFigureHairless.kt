package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_HAIRLESS

@Immutable
@Stable
object BodyFigureHairless: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_HAIRLESS,
    name = "HAIRLESS",
    text = AnnotatedString("A delicate body shouldn’t be covered in disgusting body hair, don’t you agree? No body hair will grow on your body."),
    givenPowerPoints = 3.pp,
    incompatibleWith = { listOf(BodyFigureHairy) },
    linkedMainChoice = { BodyFigureYouthful },
)