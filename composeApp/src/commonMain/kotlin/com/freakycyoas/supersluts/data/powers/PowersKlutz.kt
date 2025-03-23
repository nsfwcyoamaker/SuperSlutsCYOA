package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_KLUTZ

@Immutable
@Stable
object PowersKlutz: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_KLUTZ,
    name = "KLUTZ",
    text = AnnotatedString("You’re either really clumsy or have really bad luck, either way, this will lead to many sexually awkward situations. You can only hope that no one will catch your embarrassing moments on video and share it on the internet."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersEnlargement::class },
)