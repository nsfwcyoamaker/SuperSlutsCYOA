package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_UTILITY_BELT

@Stable
@Immutable
object OutfitFeatureUtilityBelt: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_UTILITY_BELT,
    name = "UTILITY BELT",
    text = AnnotatedString("Do you know what most superhero outfits don’t have? Pockets, and pockets can be quite useful. Utility belts are perfect for that kind of thing, not only do they look snappy, they come filled with all these high tech tools and gadgets. Think Batman’s utility belt, but sadly without the grappling gun."),
    outfitGoldPoints = (-4).gp,
)