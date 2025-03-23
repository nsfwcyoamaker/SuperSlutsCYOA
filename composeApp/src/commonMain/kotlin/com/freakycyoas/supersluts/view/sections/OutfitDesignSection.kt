package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object OutfitDesignSection: MainPageSection by SimpleSection(
    title = "OUTFIT DESIGN",
    description = AnnotatedString("Now that we have gotten that out of the way it’s finally time to design your superhero outfit! This is gonna be so much fun, I get all tingly just thinking about it. First off you need to choose 1 basic outfit design that I can work with. There is no need to rush, take as much time as you want. This is a very important decision after all. Because you’ll be wearing this outfit for the next 10 years as a superhero. If you don’t, your sponsor will sue your ass. If you have No Sponsor you will get anonymous donations from your fans on the dark web and your fans will stop paying you."),
    group = OutfitDesignChoicesGroup,
)