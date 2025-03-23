package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.buildAnnotatedString
import com.freakycyoas.supersluts.data.body_figure.BodyFigureChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object BodyFigureSection: MainPageSection by SimpleSection(
    title = "BODY FIGURE",
    description = buildAnnotatedString { append("This hero business is much more fun than I realized! Anywaaaays~ what kind of shape do you want your body to have? I’ll make sure you will keep it forever, so you can eat whatever you want and never get fat and stuff.") },
    group = BodyFigureChoicesGroup,
)