package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_slut

@Immutable
@Stable
object HairColorSlut: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.hair_slut,
    name = "SLUT",
    text = AnnotatedString("Your libido will be boosted to slut levels. You’ll crave sex on a daily basis and sex it will never be far from your thoughts. If you go too long without sex you’ll start to act like a bitch in heat."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { HairColorRed },
)