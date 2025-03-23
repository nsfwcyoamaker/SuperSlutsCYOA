package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SHAPE_OF_DESIRE

@Immutable
@Stable
object PowersShapeOfDesire: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SHAPE_OF_DESIRE,
    name = "SHAPE OF DESIRE",
    text = AnnotatedString("No matter what form you wish to assume, you will always shapeshift into a sexier version of that form. The sexier form will be based on what the 5 closest people find sexually attractive."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersShapeshifting::class },
    requires = { listOf(PowersShapeshifting()) },
)