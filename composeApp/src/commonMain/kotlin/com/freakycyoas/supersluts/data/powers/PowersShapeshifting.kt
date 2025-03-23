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
import superslutscyoa.composeapp.generated.resources.powers_SHAPESHIFTING

@Immutable
@Stable
class PowersShapeshifting(selectedLevel: Int? = null): LeveledMainChoice by com.freakycyoas.supersluts.data.DefaultLeveledMainChoice(
    image = Res.drawable.powers_SHAPESHIFTING,
    name = "SHAPESHIFTING",
    levels = listOf(
        com.freakycyoas.supersluts.data.PowerLevel(
            1,
            (-10).pp,
            AnnotatedString("Choose 1 form that’s roughly the same size as your original form, you can now switch form between your original form and your chosen form. You can’t stay shapeshifted for longer than 4 hours per day. Also, you can’t heal wounds by shapeshifting.")
        ),
        com.freakycyoas.supersluts.data.PowerLevel(2, (-25).pp, buildAnnotatedString {
            append("You can freely alter your own appearance within biological limits, but you can’t decrease or increase your overall body size. To do so you would need ")
            withStyle(choiceSubtitleSpanStyle) { append("Shrinking") }
            append(" and ")
            withStyle(choiceSubtitleSpanStyle) { append("Enlargement") }
            append(". You will be able to stay shapeshifted for up to 8 hours per day.")
        }),
        com.freakycyoas.supersluts.data.PowerLevel(
            3,
            (-120).pp,
            AnnotatedString("You can now remain shapeshifted indefinitely and you can heal wounds by shapeshifting.")
        ),
    ),
    linkedDrawbackChoice = { PowersShapeOfDesire },
    selectedLevel = selectedLevel,
    constructor = ::PowersShapeshifting,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)