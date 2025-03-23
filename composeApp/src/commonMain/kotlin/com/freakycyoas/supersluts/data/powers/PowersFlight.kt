package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_FLIGHT

@Immutable
@Stable
class PowersFlight(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_FLIGHT,
    name = "FLIGHT",
    levels = listOf(
        PowerLevel(1, (-10).pp, AnnotatedString("You can’t fly, but you can hover. Your maximum hover distance is 4 meters away from the ground. If you jump from a building, for example, you’re able to glide through the air using your hovering power.")),
        PowerLevel(2, (-20).pp, AnnotatedString("You’re now able to fly for real, you’ll be as fast as the fastest helicopter.")),
        PowerLevel(3, (-30).pp, AnnotatedString("You can now fly much faster than the speed of sound. At your top speed, you will look like a blur.")),
    ),
    linkedDrawbackChoice = { PowersCommando },
    selectedLevel = selectedLevel,
    constructor = ::PowersFlight,
)