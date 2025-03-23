package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_airhead

@Immutable
@Stable
object HairColorAirhead: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.hair_airhead,
    name = "AIRHEAD",
    text = AnnotatedString("You're going to be a bit dumber. You'll often find yourself lose your train of thought and forget things a lot, but that's totally fine, being a bit ditzy is totally adorbs! Being smart is so overrated."),
    givenPowerPoints = 12.pp,
    linkedMainChoice = { HairColorBlonde },
)
