package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_WEAPON_MASTERY

@Immutable
@Stable
class PowersWeaponMastery(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_WEAPON_MASTERY,
    name = "WEAPON MASTERY",
    levels = listOf(
        PowerLevel(1, (-10).pp, AnnotatedString("Choose 1 weapon, you become a master of your chosen weapon and can use it at a level of skill that few mortals could match.")),
        PowerLevel(2, (-20).pp, AnnotatedString("You don’t have mastery over 1 weapon, no, you have complete mastery over every single weapon in existence. You can even use improvised weapons like a coin or a pen to devastating effect. This will make you an extremely well rounded and versatile fighter.")),
        PowerLevel(3, (-30).pp, AnnotatedString("Your mastery of weapons is completely uncanny. You can fight people who are stronger and faster than you on an equal footing using your flawless technique and skill to overcome their raw power and speed.")),
    ),
    linkedDrawbackChoice = { PowersBullseye },
    selectedLevel = selectedLevel,
    constructor = ::PowersWeaponMastery,
)
