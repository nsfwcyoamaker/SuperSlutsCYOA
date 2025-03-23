package com.freakycyoas.supersluts.data.appearance

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.appearance_unnatural_skin_color

@Immutable
@Stable
object AppearanceUnnaturalSkinColor: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.appearance_unnatural_skin_color,
    name = "UNNATURAL SKIN COLOR",
    text = AnnotatedString("How about we just change your skin color? That would be totally aaaawseome!~ Just pick any unnatural skin color you want and I'Il work my magic on you."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { AppearanceHuman },
)