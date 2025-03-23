package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_YOUTHFUL

@Immutable
@Stable
object BodyFigureYouthful: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_YOUTHFUL,
    name = "YOUTHFUL",
    text = AnnotatedString("I can make you look super young and cute! You will be so adorable, just imagining it makes me want to pinch your little checks and hug you. On the downside, this body type will make bad guys want to do a lot more unsavory things to you than pinch your checks."),
    powerPoints = 3.pp,
    linkedDrawbackChoice = { BodyFigureHairless },
)