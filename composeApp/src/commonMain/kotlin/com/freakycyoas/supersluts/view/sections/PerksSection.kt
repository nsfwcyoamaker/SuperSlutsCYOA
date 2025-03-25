package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.perks.PerksChoicesGroup
import com.freakycyoas.supersluts.theme.goldPointsStyle
import com.freakycyoas.supersluts.view.MainPageSection

object PerksSection: MainPageSection by MixedSection(
    title = "Perks",
    description = buildAnnotatedString {
        append("Now on to the perks! Let's see what goodies you can buy with all those ")
        withStyle(goldPointsStyle) { append("Gold Points") }
        append(" you have gathered! There are a lot of things you might want to get as a superhero. If you have the ")
        withStyle(goldPointsStyle) { append("Gold Points") }
        append(" for it that is.")
    },
    group = PerksChoicesGroup,
)