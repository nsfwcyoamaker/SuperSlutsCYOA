package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_REGENERATION

@Immutable
@Stable
class PowersRegeneration(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_REGENERATION,
    name = "REGENERATION",
    levels = listOf(
        PowerLevel(1, (-10).pp, AnnotatedString("Any wound you suffer will get healed within a few days. Your regeneration will also prevent scarring, regrow limbs, cure any diseases and heal poisons.")),
        PowerLevel(2, (-20).pp, AnnotatedString("Your regeneration is amped up and will now heal any damage your body has suffered within minutes.")),
        PowerLevel(3, (-40).pp, AnnotatedString("It will only take seconds for your regeneration to fully heal your body. As long as there is an atom left of you, you will survive any attack or injury.")),
    ),
    linkedDrawbackChoice = { PowersMasochist },
    selectedLevel = selectedLevel,
    constructor = ::PowersRegeneration,
)