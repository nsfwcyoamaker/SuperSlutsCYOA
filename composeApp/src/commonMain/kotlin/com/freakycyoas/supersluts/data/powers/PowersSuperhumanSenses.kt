package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUPERHUMAN_SENSES

@Immutable
@Stable
class PowersSuperhumanSenses(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUPERHUMAN_SENSES,
    name = "SUPERHUMAN SENSES",
    levels = listOf(
        PowerLevel(1, (-5).pp, AnnotatedString("All of your 5 senses are heightened to the best of the senses in the animal kingdom. You can also selectively tune down your senses.")),
        PowerLevel(2, (-15).pp, AnnotatedString("Your senses have transcended the limits of biology. You can now tell if someone is lying by listening to their heartbeat. You can use any sound as a sonar and fight while completely blinded.")),
        PowerLevel(3, (-25).pp, AnnotatedString("You can now eavesdrop on any conversation inside a 100km radius and pinpoint people by their smell in a similar radius. You’re also aware of everything that is happening around you, making it next to impossible to ambush you.")),
    ),
    linkedDrawbackChoice = { PowersSuperSensitive },
    selectedLevel = selectedLevel,
    constructor = ::PowersSuperhumanSenses
)