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
import superslutscyoa.composeapp.generated.resources.powers_ABSORB_POWER

@Immutable
@Stable
class PowersAbsorbPower(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_ABSORB_POWER,
    name = "ABSORB POWER",
    levels = listOf(
        PowerLevel(1, (-30).pp, AnnotatedString("Whenever you touch someone you can absorb 1 of their powers, you choose which power. Absorbing their power will allow you to use that exact power for 20 minutes. You can’t absorb the power of martial artists or technology and you can’t absorb more than 1 power at a time, but you can replace the absorbed power.")),
        PowerLevel(2, (-60).pp, AnnotatedString("You can now absorb up to 2 powers instead of only 1. The 2 powers you absorb don't have to come from the same person. You can also keep absorbed powers for up to 1 hour.")),
        PowerLevel(3, (-80).pp, AnnotatedString("When you absorb someone’s power you can choose if you want to drain their power from them. Draining their power will make them lose their power for as long as you have access to it. You also be able to keep absorbed powers for up to 24 hours.")),
    ),
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.powers.PowersPowerSlut },
    selectedLevel = selectedLevel,
    constructor = ::PowersAbsorbPower,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)