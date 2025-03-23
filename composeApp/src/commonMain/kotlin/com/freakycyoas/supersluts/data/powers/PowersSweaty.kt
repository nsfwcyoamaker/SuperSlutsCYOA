package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SWEATY

@Immutable
@Stable
object PowersSweaty: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SWEATY,
    name = "SWEATY",
    text = AnnotatedString("The more you use your superpowers the sweatier you will become. Use your powers enough and you will reach absurd levels of sweatiness. I recommend that you go with a white superhero costume, as white clothes become transparent when wet."),
    givenPowerPoints = 9.pp,
    linkedMainChoice = { PowersSuperhumanStrength::class }
)