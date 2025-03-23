package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.*
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_BUTT_WINDOWS

@Immutable
@Stable
object OutfitFeatureButtWindows: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_BUTT_WINDOWS,
    name = "BUTT WINDOWS",
    text = AnnotatedString("Or perhaps we could add a pair of butt windows for your butt cheeks. Your slappable ass would look even more slappable!"),
    incompatibleWith = { listOf(SponsorWaltDisney, OutfitDesignNude, OutfitDesignLingerie, OutfitDesignBikini, OutfitDesignLeotard, OutfitDesignDress, OutfitFeatureOpenBottom, OutfitFeatureAnusWindow) },
    goldPoints = 3.gp
)