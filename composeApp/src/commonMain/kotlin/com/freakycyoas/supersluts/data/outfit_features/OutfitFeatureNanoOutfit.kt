package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_NANO_OUTFIT

@Stable
@Immutable
object OutfitFeatureNanoOutfit: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_NANO_OUTFIT,
    name = "NANO OUTFIT",
    text = AnnotatedString("It can be a pain in the ass to change outfit in a pinch. But with a nano outfit, your superhero costume will be able to shrink down to an armband or a watch and with the tap of a button, it will expand and automatically switch outfit, talk about fancy!"),
    outfitGoldPoints = (-5).gp
)