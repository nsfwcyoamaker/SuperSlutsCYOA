package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.genitals.GenitalsVagina
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_CAMEL_STRING

@Immutable
@Stable
object OutfitFeatureCamelString: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_CAMEL_STRING,
    name = "CAMEL STRING",
    text = AnnotatedString("Want me to add a camel string to your outfit? It's like a thong but for the pussy, it will give you a nice and big camel toe."),
    requires = { listOf(GenitalsVagina) },
    incompatibleWith = { listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, OutfitDesignNude, OutfitFeatureCrotchWindow, OutfitFeatureOpenBottom) },
    goldPoints = 2.gp
)