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
import superslutscyoa.composeapp.generated.resources.powers_ELASTICITY

@Immutable
@Stable
class PowersElasticity(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_ELASTICITY,
    name = "ELASTICITY",
    levels = listOf(
        PowerLevel(1, (-5).pp, AnnotatedString("Your body becomes extremely stretchy and almost rubbery in its elasticity. At this level, this power is only useful for sexual applications if you know what I mean.")),
        PowerLevel(2, (-15).pp, AnnotatedString("Your body mass can now be stretched out 4 times its size and you gain extremely limited shapeshifting abilities. For example, you could turn your body into a living parachute to slow someone’s fall.")),
        PowerLevel(3, (-30).pp, AnnotatedString("Your body can now be stretched out 20 times its regular size. Because of your elasticity, blunt force won’t damage you. Bullets will bounce back and if someone with super strength punches you, the force of their punch will rebound and send them flying.")),
    ),
    linkedDrawbackChoice = { PowersSizeQueen },
    selectedLevel = selectedLevel,
    constructor = ::PowersElasticity,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)