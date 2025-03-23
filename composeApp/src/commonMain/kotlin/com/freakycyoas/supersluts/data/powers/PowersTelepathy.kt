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
import superslutscyoa.composeapp.generated.resources.powers_TELEPATHY

@Immutable
@Stable
class PowersTelepathy(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_TELEPATHY,
    name = "TELEPATHY",
    levels = listOf(
        PowerLevel(1, (-10).pp, AnnotatedString("You can read the surface thoughts of any person within 1km of you. Allowing you to sense their mood, what emotion they feel at the moment and anything they think about for the moment.")),
        PowerLevel(2, (-35).pp, AnnotatedString("You are able to read minds perfectly across the planet. You can peer through your enemies’ memories and quickly find out their fears and weaknesses etc. You can even bend their minds to create illusions.")),
        PowerLevel(3, (-70).pp, AnnotatedString("With your brain powers, you can mind control weak-willed individuals indefinitely, but they must remain within 100 meters of you or you will lose control over them. You can even dominate and control 1 strong-willed individual for as long as they remain within 20 meters of you.")),
    ),
    linkedDrawbackChoice = { PowersMindFucked },
    selectedLevel = selectedLevel,
    constructor = ::PowersTelepathy,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)