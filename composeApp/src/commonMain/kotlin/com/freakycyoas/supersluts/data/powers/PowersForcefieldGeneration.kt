package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.data.power_source.PowerSourceMartialArts
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_FORCEFIELD_GENERATION

@Immutable
@Stable
class PowersForcefieldGeneration(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_FORCEFIELD_GENERATION,
    name = "FORCEFIELD GENERATION",
    levels = listOf(
        PowerLevel(1, (-20).pp, AnnotatedString("You gain the power to create solid barriers made out of energy, they will exist for as long as you concentrate on them. Your forcefields are limited to the size of 10-meter diameters, you can shape them however you want. If you create multiple forcefields all of them will count towards your maximum size limit. Your forcefield will have similar durability to a 5 cm thick steel wall.")),
        PowerLevel(2, (-40).pp, AnnotatedString("The size limit of your forcefields is now 20-meter diameters and each forcefield is will be able to withstand 1 attack that would normally break them. Your forcefields will also reflect projectiles back onto their attackers as long as your forcefields can withstand the impact of the projectiles.")),
        PowerLevel(3, (-60).pp, AnnotatedString("Your forcefields are now indestructible.")),
    ),
    linkedDrawbackChoice = { PowersProtection },
    selectedLevel = selectedLevel,
    constructor = ::PowersForcefieldGeneration,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)