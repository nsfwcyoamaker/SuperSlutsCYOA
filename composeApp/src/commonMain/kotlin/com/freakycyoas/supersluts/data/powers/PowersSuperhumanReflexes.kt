package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUPERHUMAN_REFLEXES

@Immutable
@Stable
class PowersSuperhumanReflexes(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUPERHUMAN_REFLEXES,
    name = "SUPERHUMAN REFLEXES",
    levels = listOf(
        PowerLevel(1, (-5).pp, AnnotatedString("Your reflexes and reaction time are vastly improved. You will be able to dodge and block normal melee attacks with ease. This power manifests as subconscious reflexes, rather than an ability to think at an accelerated rate.")),
        PowerLevel(2, (-10).pp, AnnotatedString("You gain the ability to experience time at a decelerated rate while in danger or at will. Most attacks will look sluggish to you and you will be able to dodge \"slow-moving\" projectiles like arrows and crossbow bolts.")),
        PowerLevel(3, (-15).pp, AnnotatedString("Your ability to experience time at a decelerated rate is further enhanced. As long as an attack is within your field of sight you will be able to register it, no matter how fast the attack is. You can even detect attacks that are faster than the speed of light.")),
    ),
    linkedDrawbackChoice = { PowersNoGagReflex },
    selectedLevel = selectedLevel,
    constructor = ::PowersSuperhumanReflexes
)