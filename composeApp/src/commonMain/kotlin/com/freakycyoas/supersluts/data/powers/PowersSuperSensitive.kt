package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUPER_SENSITIVE

@Immutable
@Stable
object PowersSuperSensitive: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SUPER_SENSITIVE,
    name = "SUPER SENSITIVE",
    text = AnnotatedString("2 Minutes of sexual stimulation is all it takes to make you climax. For each time you orgasm beyond your first you will progressively get less intelligent as your brain is overwhelmed by pleasure. The intelligence reduction is temporary and will last for double the amount of time you were stimulated."),
    givenPowerPoints = 13.pp,
    linkedMainChoice = { PowersSuperhumanSenses::class }
)