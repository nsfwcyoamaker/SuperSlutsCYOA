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
import superslutscyoa.composeapp.generated.resources.powers_INVISIBILITY

@Immutable
@Stable
class PowersInvisibility(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_INVISIBILITY,
    name = "INVISIBILITY",
    levels = listOf(
        PowerLevel(1, (-8).pp, AnnotatedString("You can become translucent and blurry at will. If you stand still while being blurry you will blend in with your surroundings and become completely invisible for as long as you don’t move.")),
        PowerLevel(2, (-20).pp, AnnotatedString("You are now able to become invisible at will and move while being invisible.")),
        PowerLevel(3, (-30).pp, AnnotatedString("The invisibility field you project around yourself will now shield you from being detected by infrared optics like heat vision goggles and similar devices. The invisibility field will also muffle most of the sounds you’re making, which will make it harder to detect you by sound.")),
    ),
    linkedDrawbackChoice = { PowersPermanentInvisibility },
    selectedLevel = selectedLevel,
    constructor = ::PowersInvisibility,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)