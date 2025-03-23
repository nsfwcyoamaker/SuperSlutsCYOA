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
import superslutscyoa.composeapp.generated.resources.powers_SUPERHUMAN_SPEED

@Immutable
@Stable
class PowersSuperhumanSpeed(selectedLevel: Int? = null): LeveledMainChoice by com.freakycyoas.supersluts.data.DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUPERHUMAN_SPEED,
    name = "SUPERHUMAN SPEED",
    levels = listOf(
        com.freakycyoas.supersluts.data.PowerLevel(
            1,
            (-10).pp,
            AnnotatedString("You're able to move 2 times as fast. It might not sound that impressive but punching and kicking twice as fast and moving at double your speed in a fight is a huge advantage.")
        ),
        com.freakycyoas.supersluts.data.PowerLevel(
            2,
            (-20).pp,
            AnnotatedString("You’re able to move 4 times as fast and you can run at a speed comparable to the fastest sports car. But unlike a sports car, you can rapidly change direction and still maintain your speed.")
        ),
        com.freakycyoas.supersluts.data.PowerLevel(3, (-30).pp,
            buildAnnotatedString {
                append("You’re able to move 8 times as fast and you can run much faster than the speed of sound. You can also instantly accelerate to reach your top running speed in the blink of an eye. To use this level of speed effectively you will need at least ")
                withStyle(choiceSubtitleSpanStyle) {
                    append("Superhuman Reflexes Level 2")
                }
                append(".")
            }
        ),
    ),
    linkedDrawbackChoice = { PowersSexMarathon },
    selectedLevel = selectedLevel,
    constructor = ::PowersSuperhumanSpeed
)