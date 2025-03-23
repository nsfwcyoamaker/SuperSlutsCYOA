package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_TRANSPARENT

@Immutable
@Stable
object OutfitFeatureTransparent: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_TRANSPARENT,
    name = "TRANSPARENT",
    text = AnnotatedString("If you really want to show off your body I could make your outfit transparent! It will be like wearing an outfit while at the same time wearing nothing at all."),
    incompatibleWith = { listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, OutfitDesignNude) },
    goldPoints = 5.gp
)