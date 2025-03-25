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
import superslutscyoa.composeapp.generated.resources.powers_POWER_MODE

@Immutable
@Stable
class PowersPowerMode(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_POWER_MODE,
    name = "POWER MODE",
    levels = listOf(
        PowerLevel(1, (-10).pp, buildAnnotatedString {
            append("Choose 1 of your powers, you can’t choose ")
            withStyle(choiceSubtitleSpanStyle) { append("Power Mode") }
            append(". You can enter a power mode to temporarily increase your chosen power by 1 level. Your power mode will slightly alter your appearance and make you look more badass. You get to choose the transformation, it can be anything from gaining an energy aura and gaining yellow spiky hair to turning into a dragon. It will last for 30 minutes and can only be used once per month.")
        }),
        PowerLevel(2, (-20).pp, buildAnnotatedString {
            append("Instead of choosing 1 power, you get to choose 2 powers which will be boosted 1 level each or choose 1 power which will be boosted 2 levels for as long as your power mode lasts. You can’t choose ")
            withStyle(choiceSubtitleSpanStyle) { append("Power Mode") }
            append(".")
        }),
        PowerLevel(
            3,
            (-40).pp,
            AnnotatedString("Instead of choosing any powers, all of your powers are increased by 1 level while your power mode is active. Your power mode can now be used once per week.")
        ),
    ),
    linkedDrawbackChoice = { PowersPowerfulOrgasms },
    selectedLevel = selectedLevel,
    constructor = ::PowersPowerMode,
)