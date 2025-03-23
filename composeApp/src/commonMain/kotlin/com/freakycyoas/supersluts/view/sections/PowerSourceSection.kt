package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.power_source.PowerSourceChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object PowerSourceSection: MainPageSection by SimpleSection(
    title = "POWER SOURCE",
    description = AnnotatedString("So let’s get to the boring part, your superpowers... I am honestly tempted to give you superhuman strength and durability and just call it a day, but another super important part of being a superhero is to wear a skintight outfit that is really thematic for your superpowers. So I guess I’ll have to do this properly in order to make you the perfect outfit later. Now, we will start by choosing the nature and source of your powers."),
    group = PowerSourceChoicesGroup,
)