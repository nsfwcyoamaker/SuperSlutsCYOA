package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_VISION_DEVICE

@Stable
@Immutable
object OutfitFeatureVisionDevice: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_VISION_DEVICE,
    name = "VISION DEVICE",
    text = AnnotatedString("A vision device will be part of your outfit. The device can take the form of a visor, goggles, sunglasses, high tech lenses or anything similar. With this deceive you will be able to switch between different vision modes like infrared, night vision, binocular view, x-ray vision, etc."),
    outfitGoldPoints = (-10).gp
)