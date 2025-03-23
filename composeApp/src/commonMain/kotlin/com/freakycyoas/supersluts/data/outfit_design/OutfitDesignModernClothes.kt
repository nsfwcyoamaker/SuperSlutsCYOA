package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_MODERN_CLOTHES

@Immutable
@Stable
object OutfitDesignModernClothes: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_MODERN_CLOTHES,
    name = "MODERN CLOTHES",
    text = AnnotatedString("Perhaps you want a more modern look? We can mix and match your favorite combination of modern clothing. The downside to this is that you won’t stand out as much in crowds, but I guess that could be a good thing depending on what kind of superhero you want to be."),
)