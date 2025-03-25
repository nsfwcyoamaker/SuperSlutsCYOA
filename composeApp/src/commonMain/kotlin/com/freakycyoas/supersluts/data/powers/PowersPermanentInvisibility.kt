package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_PERMANENT_INVISIBILITY

@Immutable
@Stable
object PowersPermanentInvisibility: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_PERMANENT_INVISIBILITY,
    name = "PERMANENT INVISIBILITY",
    text = buildAnnotatedString {
        append("You have no control over your invisibility powers and can’t turn them off, so you’re always invisible. If you have ")
        withStyle(choiceSubtitleSpanStyle) { append("Invisibility Level 1") }
        append(" you will always be blurry instead.")
    },
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersInvisibility::class },
    requires = { listOf(PowersInvisibility()) }
)