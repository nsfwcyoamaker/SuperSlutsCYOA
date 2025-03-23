package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_FAT

@Immutable
@Stable
object BodyFigureFat: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_FAT,
    name = "FAT",
    text = AnnotatedString("Do you wanna look totally flubbers? I can turn you into a fat mc fatty, you’ll be the hottest landwhale ever!"),
    powerPoints = 10.pp,
    incompatibleWith = { listOf(BodyFigureWorkoutWhore) },
    linkedDrawbackChoice = { BodyFigureHungryHippo },
)