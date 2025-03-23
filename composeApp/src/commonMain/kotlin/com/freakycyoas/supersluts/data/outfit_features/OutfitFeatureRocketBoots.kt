package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_ROCKET_BOOTS

@Stable
@Immutable
object OutfitFeatureRocketBoots: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_ROCKET_BOOTS,
    name = "ROCKET BOOTS",
    text = AnnotatedString("The future is now! Upgrade your outfit with a pair of rocket boots and gain the ability to fly at a speed of 30km/h. The rocket boots will also have a maglock mode, which will allow you to climb vertical metal surfaces. It can be pretty useful if you plan on fighting in space or in another zero-g environment."),
    outfitGoldPoints = (-8).gp,
)