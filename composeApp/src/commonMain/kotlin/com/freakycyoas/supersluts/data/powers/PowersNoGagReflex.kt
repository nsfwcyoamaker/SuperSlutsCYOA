package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_NO_GAG_REFLEX

@Immutable
@Stable
object PowersNoGagReflex: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_NO_GAG_REFLEX,
    name = "NO GAG REFLEX",
    text = AnnotatedString("You have no gag reflex and can deepthroat cocks like a top dollar whore. If your enemies find out this talent of yours, they will surely take advantage of your mouth pussy."),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { PowersSuperhumanReflexes::class }
)