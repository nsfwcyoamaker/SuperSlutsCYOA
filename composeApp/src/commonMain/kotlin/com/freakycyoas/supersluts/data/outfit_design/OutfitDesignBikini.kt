package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_BIKINI

@Immutable
@Stable
object OutfitDesignBikini: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_BIKINI,
    name = "BIKINI",
    text = AnnotatedString("Wearing a bikini outfit is a classic option. A solid choice, minimalistic and sexy! There are so many different styles of bikinis I don’t know where to begin. Do you want a string bikini, bandeau bikini, c-string bikini, micro bikini, v-string monokini or perhaps I’ll just read your mind instead of listing every bikini design. I bet you don’t know what half of those even look like."),
)