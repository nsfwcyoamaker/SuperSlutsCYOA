package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_TELEPORTATION

@Immutable
@Stable
class PowersTeleportation(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_TELEPORTATION,
    name = "TELEPORTATION",
    levels = listOf(
        PowerLevel(1, (-25).pp, AnnotatedString("You’re able to teleport to any location within your sight, but you can’t teleport more than 10 meters at a time.")),
        PowerLevel(2, (-50).pp, AnnotatedString("Your teleportation powers no longer have a distance limit. As long as you are able to see your location you will be able to teleport to it. You can also bring other people with you when you teleport as long as you touch them.")),
        PowerLevel(3, (-70).pp, AnnotatedString("You can teleport to any location which you have previously visited after gaining your teleportation powers.")),
    ),
    linkedDrawbackChoice = { PowersSexToyTeleportation },
    selectedLevel = selectedLevel,
    constructor = ::PowersTeleportation,
)