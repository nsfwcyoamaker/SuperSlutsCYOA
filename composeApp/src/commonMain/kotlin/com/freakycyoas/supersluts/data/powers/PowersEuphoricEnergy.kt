package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_EUPHORIC_ENERGY

@Immutable
@Stable
object PowersEuphoricEnergy: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_EUPHORIC_ENERGY,
    name = "EUPHORIC ENERGY",
    text = AnnotatedString("The energy that you manipulate will now inflict pleasure instead of destruction. Multiple consecutive hits can now cause your enemies to pass out from being overwhelmed with pleasure."),
    givenPowerPoints = 2.pp,
    linkedMainChoice = { PowersEnergyManipulation::class },
)