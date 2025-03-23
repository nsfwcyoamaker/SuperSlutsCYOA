package com.freakycyoas.supersluts.data.appearance

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.appearance_otherwordly

@Immutable
@Stable
object AppearanceOtherwordly: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.appearance_otherwordly,
    name = "OTHERWORLDLY",
    text = buildAnnotatedString {
        append("You must choose to gain at least 1 major biologically impossible body feature which will affect most of your body. It can be the same as the minor feature you choose from ")
        withStyle(choiceSubtitleSpanStyle) { append("Metahuman") }
        append(", but on a larger scale.")
    },
    givenPowerPoints = 15.pp,
    linkedMainChoice = { AppearanceMetahuman },
)