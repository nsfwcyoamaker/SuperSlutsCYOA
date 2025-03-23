package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUPERHUMAN_DURABILITY

@Immutable
@Stable
class PowersSuperhumanDurability(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUPERHUMAN_DURABILITY,
    name = "SUPERHUMAN DURABILITY",
    levels = listOf(
        PowerLevel(1, (-10).pp, AnnotatedString("A regular human cannot damage you with any kind of regular melee weapon. Bullets will still damage you, but they aren’t super dangerous like they are to a normal human.")),
        PowerLevel(2, (-30).pp, AnnotatedString("Your body will be durable enough to survive falls from any height. Regular guns, grenades, bombs and rocket launchers will only sting. It would require some high tech to make those weapons damage you.")),
        PowerLevel(3, (-60).pp, AnnotatedString("Your body is indestructible, there is literally nothing that can physically harm you. Nuclear bombs, lethal poisons and doomsday weapons are all a joke to you.")),
    ),
    linkedDrawbackChoice = { PowersNearlyMortal },
    selectedLevel = selectedLevel,
    constructor = ::PowersSuperhumanDurability
)