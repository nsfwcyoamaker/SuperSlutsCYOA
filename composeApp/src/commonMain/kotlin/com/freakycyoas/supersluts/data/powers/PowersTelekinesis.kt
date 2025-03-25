package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.data.power_source.PowerSourceMartialArts
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_TELEKINESIS

@Immutable
@Stable
class PowersTelekinesis(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_TELEKINESIS,
    name = "TELEKINESIS",
    levels = listOf(
        PowerLevel(
            1,
            (-10).pp,
            AnnotatedString("You can move objects with the power of your mind. Your telekinesis has a strength comparable to peak human strength. However, you can’t use telekinesis directly on people. For example, you can’t telekinetically punch someone, but you can telekinetically throw things at them.")
        ),
        PowerLevel(2, (-50).pp,
            buildAnnotatedString {
                append("You can now stop bullets in midair, throw cars and perform similar feats. You can only use telekinesis at the strength of ")
                withStyle(choiceSubtitleSpanStyle) { append("Telekinesis Level 1") }
                append(" directly on people.")
            }
        ),
        PowerLevel(3, (-100).pp,
            buildAnnotatedString {
                append("Your telekinesis is strong enough to raze cities, pull down comets from space and other epic feats. But you can only use telekinesis at the strength of ")
                withStyle(choiceSubtitleSpanStyle) { append("Telekinesis Level 2") }
                append(" directly on people.")
            }
        ),
    ),
    linkedDrawbackChoice = { PowersSuperArrogant },
    selectedLevel = selectedLevel,
    constructor = ::PowersTelekinesis,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)