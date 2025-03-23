package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_LOIN_CLOTH

@Immutable
@Stable
object OutfitFeatureLoinCloth: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_LOIN_CLOTH,
    name = "LOIN CLOTH",
    text = AnnotatedString("Perhaps you like the idea of inadvertently exposing your body? Then we could add a Loincloth to your outfit to cover your naughty bits. How embarrassing it would be if a strong gust of wind swept by and exposed your crotch."),
    requires = { listOf(OutfitFeatureCamelString, OutfitFeatureCrotchWindow, OutfitFeatureOpenBottom, OutfitFeatureThong, OutfitFeatureButtWindows, OutfitFeatureAnusWindow) },
    requiresAll = false,
    outfitGoldPoints = (-2).gp
)