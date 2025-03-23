package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_FAT_DISTRIBUTION

@Immutable
@Stable
object BodyFigureFatDistribution: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.body_figure_FAT_DISTRIBUTION,
    name = "FAT DISTRIBUTION",
    text = AnnotatedString("You can gain and lose excess fat, all the extra fat you gain will go straight into your tits, ass or thighs, your choice."),
    givenPowerPoints = 5.pp,
    incompatibleWith = { listOf(BodyFigureWorkoutWhore) },
    linkedMainChoice = { BodyFigureChubby },
)