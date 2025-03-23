package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.base.BaseChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object BaseSection: MainPageSection by SimpleSection(
    title = "BASE",
    description = AnnotatedString("All superheroes need a base of operation and you’re no exception! If only to act as a wardrobe for your superhero outfit."),
    group = BaseChoicesGroup,
)