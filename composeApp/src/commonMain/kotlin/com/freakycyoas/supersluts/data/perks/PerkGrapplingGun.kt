package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_GRAPPLING_GUN

@Immutable
@Stable
object PerkGrapplingGun: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_GRAPPLING_GUN,
    name = "GRAPPLING GUN",
    text = AnnotatedString("A grappling gun is easy to hide and can be used to swing like Tarzan between buildings. It will give you a lot of mobility options and it's a relatively cheap device. Very popular among close combat oriented superheroes in urban areas. This device will be invaluable if you don't have any ways to deal with flying villains."),
    goldPoints = (-4).gp
)