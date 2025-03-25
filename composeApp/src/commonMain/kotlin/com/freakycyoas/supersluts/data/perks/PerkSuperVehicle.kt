package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_SUPER_VEHICLE

@Immutable
@Stable
object PerkSuperVehicle: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_SUPER_VEHICLE,
    name = "SUPER VEHICLE",
    text = AnnotatedString("Ever wanted a high tech super vehicle equipped with more weapons and gadgets than you can count? For example, you could get a motorcycle, fighter jet, car, hoverboard or a spaceship. If you plan on having intergalactic superhero adventures a spaceship is a must! You could even combine your base with this option to turn it into a giant vehicle, think Nick Fury's Helicarrier. OS! will supply you with a replacement if it gets destroyed."),
    goldPoints = (-10).gp
)