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
import superslutscyoa.composeapp.generated.resources.powers_HEALING

@Immutable
@Stable
class PowersHealing(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_HEALING,
    name = "HEALING",
    levels = listOf(
        PowerLevel(1, (-15).pp, AnnotatedString("You have the power to heal those you touch. You can regrow limbs, remove scars, cure diseases and heal poisons. Healing someone will take a few minutes. The more severe their wounds are the longer the time. For example, bringing someone back from the brink of death would take 10 minutes, while healing a few broken bones would only take 1 minute.")),
        PowerLevel(2, (-25).pp, AnnotatedString("You no longer need to touch those you heal. You can shoot beams of healing energy that will heal those it touches.")),
        PowerLevel(3, (-55).pp, AnnotatedString("Your healing is much more powerful. You will now be able to heal people in seconds, you can even resurrect dead people by healing them for 5 minutes.")),
    ),
    linkedDrawbackChoice = { PowersHealSlut },
    selectedLevel = selectedLevel,
    constructor = ::PowersHealing,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)