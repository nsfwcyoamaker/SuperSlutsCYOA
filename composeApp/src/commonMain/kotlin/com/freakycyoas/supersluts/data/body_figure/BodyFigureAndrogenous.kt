package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_ANDROGENOUS

@Immutable
@Stable
object BodyFigureAndrogenous: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_ANDROGENOUS,
    name = "ANDROGENOUS",
    text = AnnotatedString("Wanna look feminine and masculine at the same time? People will have a hard time discerning your true gender."),
    powerPoints = 3.pp,
    linkedDrawbackChoice = { BodyFigureCrossdresser },
)