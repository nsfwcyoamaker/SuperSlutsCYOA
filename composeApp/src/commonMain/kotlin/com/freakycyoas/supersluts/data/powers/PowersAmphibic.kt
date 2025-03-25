package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_AMPHIBIC

@Immutable
@Stable
class PowersAmphibic(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_AMPHIBIC,
    name = "AMPHIBIC",
    levels = listOf(
        PowerLevel(
            1,
            (-5).pp,
            AnnotatedString("Your body is comfortable in water of any temperature. You can also hold your breath for 30 minutes and you can swim twice as fast.")
        ),
        PowerLevel(
            2,
            (-15).pp,
            AnnotatedString("You’re able to breathe underwater and you’re able to swim faster than any sea creature. You can also fight just as effectively underwater as you can on land.")
        ),
        PowerLevel(3, (-25).pp,
            buildAnnotatedString {
                append("You gain 1 extra level of ")
                withStyle(choiceSubtitleSpanStyle) { append("Superhuman Strenght") }
                append(", ")
                withStyle(choiceSubtitleSpanStyle) { append("Superhuman Senses") }
                append(", ")
                withStyle(choiceSubtitleSpanStyle) { append("Superhuman Speed") }
                append(", ")
                withStyle(choiceSubtitleSpanStyle) { append("Superhuman Reflexes") }
                append(" and ")
                withStyle(choiceSubtitleSpanStyle) { append("Superhuman Agility") }
                append(" while you’re underwater.")
            }
        )
    ),
    linkedDrawbackChoice = { PowersWaterworks },
    selectedLevel = selectedLevel,
    constructor = ::PowersAmphibic,
)