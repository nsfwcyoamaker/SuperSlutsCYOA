package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_ENERGY_MANIPULATION

@Immutable
@Stable
class PowersEnergyManipulation(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_ENERGY_MANIPULATION,
    name = "ENERGY MANIPULATION",
    levels = listOf(
        PowerLevel(1, (-20).pp, AnnotatedString("You can imbue a small part of your body like your fists and feet or objects with energy for as long as you maintain contact with them. Objects or body parts that are imbued with energy become indestructible. Sharp objects will cut and pierce almost all non—organic material, making armor useless. While blunt objects will transfer twice as much kinetic force, making them deal double damage.")),
        PowerLevel(2, (-30).pp, AnnotatedString("Objects that are imbued with energy will retain the energy for some time after you let go of them. Allowing you to make use of imbued ranged weapons like shurikens, boomerangs, bows, crossbows or throwing knives.")),
        PowerLevel(3, (-40).pp, AnnotatedString("You can now fire destructive blasts of concussive energy, think Hadouken or Kamehameha.")),
    ),
    linkedDrawbackChoice = { PowersEuphoricEnergy },
    selectedLevel = selectedLevel,
    constructor = ::PowersEnergyManipulation,
)