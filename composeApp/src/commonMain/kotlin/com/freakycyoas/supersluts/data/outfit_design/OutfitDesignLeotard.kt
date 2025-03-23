package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_LEOTARD

@Immutable
@Stable
object OutfitDesignLeotard: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_LEOTARD,
    name = "LEOTARD",
    text = AnnotatedString("If you don’t know what a leotard is, it’s a skin-tight one-piece garment that covers the body from crotch to chest. It’s very popular among gymnasts, acrobats, female swimmers, athletes and superheroes. Like bikini’s, there are many different designs of leotards to choose from."),
)