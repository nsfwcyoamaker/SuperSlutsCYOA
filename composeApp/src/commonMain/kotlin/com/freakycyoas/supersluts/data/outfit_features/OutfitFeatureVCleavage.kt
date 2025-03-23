package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignBikini
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignLingerie
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignTwoPieceOutfit
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_V_CLEAVAGE

@Immutable
@Stable
object OutfitFeatureVCleavage: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_V_CLEAVAGE,
    name = "V CLEAVAGE",
    text = AnnotatedString("If the boob window is not enough for you, you could go for a v cleavage. You'll show even more skin and you get to show off your tummy too."),
    incompatibleWith = { listOf(SponsorWaltDisney, OutfitDesignNude, OutfitDesignLingerie, OutfitDesignBikini, OutfitDesignTwoPieceOutfit, OutfitFeatureBoobWindow, OutfitFeatureOpenTop) },
    goldPoints = 3.gp
)