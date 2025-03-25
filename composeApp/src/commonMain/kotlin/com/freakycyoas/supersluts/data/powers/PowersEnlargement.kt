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
import superslutscyoa.composeapp.generated.resources.powers_ENLARGEMENT

@Immutable
@Stable
class PowersEnlargement(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_ENLARGEMENT,
    name = "ENLARGEMENT",
    levels = listOf(
        PowerLevel(1, (-5).pp, buildAnnotatedString {
            append("You are able to enlarge your body by double it’s size, you can also return your body to its original size. Enlarging yourself will make you gain strength appropriate to your new size unless you have ")
            withStyle(choiceSubtitleSpanStyle) { append("Superhuman Strength") }
            append(", the same is true for durability.")
        }),
        PowerLevel(
            2,
            (-15).pp,
            AnnotatedString("You can enlarge yourself up to 6 times your body size. For example, if you’re 1,80 meters tall you could grow to 10,8 meters.")
        ),
        PowerLevel(
            3,
            (-30).pp,
            AnnotatedString("You can enlarge yourself up to 300 times your body size. For example, if you’re 1,80 meters tall you could grow to 540 meters, which makes you as big as a skyscraper.")
        ),
    ),
    linkedDrawbackChoice = { PowersKlutz },
    selectedLevel = selectedLevel,
    constructor = ::PowersEnlargement,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)