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
import superslutscyoa.composeapp.generated.resources.powers_SHRINKING

@Immutable
@Stable
class PowersShrinking(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SHRINKING,
    name = "SHRINKING",
    levels = listOf(
        PowerLevel(1, (-5).pp, buildAnnotatedString {
            append("You are able to instantly shrink your body to half it’s size, you can also return your body to its original size. Shrinking will decreases your strength unless you have ")
            withStyle(choiceSubtitleSpanStyle) { append("Superhuman Strength") }
            append(".")
        }),
        PowerLevel(
            2,
            (-10).pp,
            AnnotatedString("You can shrink yourself up to 1/6 of your body size. For example, if you’re 1,60 meters tall you could shrink to 26 cm.")
        ),
        PowerLevel(
            3,
            (-25).pp,
            AnnotatedString("You can shrink yourself up to 1/150 of your body size. For example, if you’re 1,60 meters tall you could shrink to 1 cm, which would make you as tall as a USB port is wide.")
        ),
    ),
    linkedDrawbackChoice = { PowersUnbirthing },
    selectedLevel = selectedLevel,
    constructor = ::PowersShrinking,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)