package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.data.power_source.PowerSourceMartialArts
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_CLONE

@Immutable
@Stable
class PowersClone(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_CLONE,
    name = "CLONE",
    levels = listOf(
        PowerLevel(1, (-10).pp,
            buildAnnotatedString {
                append("You can summon and unsummon 1 clone of yourself. The clone will be loyal to you and instinctively know what you want it to do. However, your clone will disintegrate if it gets struck by any attack and feels pain as a result of the attack. The clone will only have access to all of your level 1 powers, except for ")
                withStyle(choiceSubtitleSpanStyle) { append("Clone") }
                append(". All of your clones will share the same cooldown for ")
                withStyle(choiceSubtitleSpanStyle) { append("Power Mode") }
                append(".")
            }
        ),
        PowerLevel(2, (-40).pp,
            buildAnnotatedString {
                append("You can now summon up to 10 clones of yourself and your clones will gain all of your level 2 powers, except for ")
                withStyle(choiceSubtitleSpanStyle) { append("Clone") }
                append(".")
            }
        ),
        PowerLevel(3, (-80).pp,
            buildAnnotatedString {
                append("You can now summon up to 100 clones of yourself. Your clones will have access to all of your powers, except ")
                withStyle(choiceSubtitleSpanStyle) { append("Clone") }
                append(" of course.")
            }
        ),
    ),
    linkedDrawbackChoice = { PowersGangbanger },
    selectedLevel = selectedLevel,
    constructor = ::PowersClone,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)