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
import superslutscyoa.composeapp.generated.resources.powers_HEX

@Immutable
@Stable
class PowersHex(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_HEX,
    name = "HEX",
    levels = listOf(
        PowerLevel(1, (-35).pp, AnnotatedString("You gain the power to hex people. When you hex someone you will reduce the potency of 1 of their powers equivalent to having their power reduced by 1 level, you choose which power. Your hexes will last for 5 minutes, they don’t stack and they can only affect 1 person at a time. Hexing a new person will remove the old hex.")),
        PowerLevel(2, (-45).pp, AnnotatedString("Your hexes will be more potent and will reduce the power you chose by 2 levels instead of only 1. Your hexes will now last for 45 minutes.")),
        PowerLevel(3, (-50).pp, AnnotatedString("Instead of reducing the potency of a power, you can completely disable the power instead. Your hexes will also last for 3 hours.")),
    ),
    linkedDrawbackChoice = { PowersMysticalTattoo },
    selectedLevel = selectedLevel,
    constructor = ::PowersHex,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)