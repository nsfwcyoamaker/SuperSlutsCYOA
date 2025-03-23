package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.buildAnnotatedString
import com.freakycyoas.supersluts.data.appearance.AppearanceChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object AppearanceSection: MainPageSection by SimpleSection(
    title = "APPEARANCE",
    description = buildAnnotatedString { append("What about some special features, like it would be totally boring if you looked like every other human. Like how lame would that be?") },
    group = AppearanceChoicesGroup,
)