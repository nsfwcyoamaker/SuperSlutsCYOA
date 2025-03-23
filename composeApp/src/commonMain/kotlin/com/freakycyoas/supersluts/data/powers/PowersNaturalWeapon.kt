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
import superslutscyoa.composeapp.generated.resources.powers_NATURAL_WEAPON

@Immutable
@Stable
class PowersNaturalWeapon(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_NATURAL_WEAPON,
    name = "NATURAL WEAPON",
    levels = listOf(
        PowerLevel(1, (-5).pp, AnnotatedString("Your body gains 1 natural weapon like razor-sharp teeth, claws, spikes, prehensile hair or horns. Your natural weapon is indestructible.")),
        PowerLevel(2, (-10).pp, AnnotatedString("Your natural weapon can now be retracted inside your body at will.")),
        PowerLevel(3, (-25).pp, AnnotatedString("Your natural weapon is much more sophisticated than simple claws or sharp teeth. For example, it could be an organ inside your mouth that allows you to breathe fire like a dragon, super-sharp armor-piercing spikes on your arms that you can fire as high- velocity projectiles or spinnerets inside your arms that allow you to shoot web similar to Spider-Man.")),
    ),
    linkedDrawbackChoice = { PowersSexualWeapon },
    selectedLevel = selectedLevel,
    constructor = ::PowersNaturalWeapon,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)