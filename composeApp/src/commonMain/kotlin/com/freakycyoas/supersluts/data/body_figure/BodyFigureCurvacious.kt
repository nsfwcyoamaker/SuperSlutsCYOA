package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_CURVACIOUS

@Immutable
@Stable
object BodyFigureCurvacious: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_CURVACIOUS,
    name = "CURVACIOUS",
    text = AnnotatedString("What about sexy? I could make your body voluptuous, lush, seductive and sultry. You will have curves at all the right places, thin waist, big hips, you know the deal, you’ll be a total sex bomb. No one would be able to resist your ample body."),
    powerPoints = 2.pp,
    linkedDrawbackChoice = { BodyFigurePlumpLips },
)