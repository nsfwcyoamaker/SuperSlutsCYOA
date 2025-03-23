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
import superslutscyoa.composeapp.generated.resources.powers_INTANGIBILITY

@Immutable
@Stable
class PowersIntangibility(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_INTANGIBILITY,
    name = "INTANGIBILITY",
    levels = listOf(
        PowerLevel(1, (-25).pp, AnnotatedString("You can shift your body between a solid and a phasing state. While in your phasing state you're able to pass through solid matter. Allowing you to walk through walls, bullets to harmlessly pass through you and similar feats. Heat, cold, energy and magic will still affect you in your phasing state. If you’re still inside something while you exit your phasing state, you will be expelled through the closest exit.")),
        PowerLevel(2, (-35).pp, AnnotatedString("You can now selectively use this power on specific areas of your body. For example, you could phase your entire body, except for your right hand which will allow you to punch while being phased.")),
        PowerLevel(3, (-50).pp, AnnotatedString("Heat, cold and energy will no longer affect you in your phasing state.")),
    ),
    linkedDrawbackChoice = { PowersStuck },
    selectedLevel = selectedLevel,
    constructor = ::PowersIntangibility,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)