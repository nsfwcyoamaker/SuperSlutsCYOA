package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_THONG

@Immutable
@Stable
object OutfitFeatureThong: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_THONG,
    name = "THONG",
    text = AnnotatedString("Want to showcase your perfectly sculpted ass? Then let's add a thong to your outfit! Watch out though, someone could give you a wicked wedgie."),
    incompatibleWith = { listOf(SponsorWaltDisney, OutfitDesignNude, OutfitFeatureOpenBottom, OutfitFeatureAnusWindow) },
    goldPoints = 2.gp
)