package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_ANTI_BULGE_HAMMERSPACE

@Immutable
@Stable
object OutfitFeatureAntiBulgeHammerspace: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_ANTI_BULGE_HAMMERSPACE,
    name = "ANTI-BULGE HAMMERSPACE",
    text = AnnotatedString("If you’re not a fan of bludges an anti-bulge hammerspace might be in order. This revolutionary technology will completely hide your bulge, your crotch will look as smooth as you want it to look. A futanari could totally pass for a girl with this tech."),
    incompatibleWith = { listOf(OutfitDesignNude, OutfitFeatureCrotchWindow, OutfitFeatureOpenBottom, OutfitFeatureCockSleeve) },
    outfitGoldPoints = (-5).gp
)