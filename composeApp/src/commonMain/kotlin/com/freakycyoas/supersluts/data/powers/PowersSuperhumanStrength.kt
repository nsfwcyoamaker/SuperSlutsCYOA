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
import superslutscyoa.composeapp.generated.resources.powers_SUPERHUMAN_STRENGTH

@Immutable
@Stable
class PowersSuperhumanStrength(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUPERHUMAN_STRENGTH,
    name = "SUPERHUMAN STRENGTH",
    levels = listOf(
        PowerLevel(
            1,
            (-7).pp,
            AnnotatedString("You’re strong enough to wrestle a bear, toss a grown human as if they were a ragdoll and you can jump 3 times as high as any human can.")
        ),
        PowerLevel(
            2,
            (-20).pp,
            AnnotatedString("You can now punch holes in armored vehicles, bend steel bars, throw cars and wield oversized weapons which no human should have the strength to wield.")
        ),
        PowerLevel(3, (-30).pp,
            buildAnnotatedString {
                append("Your strength is so great that you can juggle houses, raze skyscrapers with your bare fists and cause earthquakes by repeatedly punching the ground. You will need at least ")
                withStyle(choiceSubtitleSpanStyle) {
                    append("Superhuman Durability Level 2")
                }
                append(" to use this level of Strength without damaging your own body.")
            }
        ),
    ),
    linkedDrawbackChoice = { PowersSweaty },
    selectedLevel = selectedLevel,
    constructor = ::PowersSuperhumanStrength
)