package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignLingerie
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_BOOB_WINDOW

@Immutable
@Stable
object OutfitFeatureBoobWindow: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_BOOB_WINDOW,
    name = "BOOB WINDOW",
    text = AnnotatedString("We could add a boob window to your outfit. It would allow you to show off your big tiddies without looking like a total pervert. Remember sex sells, the sexier you are the more delicious sponsorship money you'll get!"),
    incompatibleWith = { listOf(OutfitDesignNude, OutfitDesignLingerie, OutfitFeatureVCleavage, OutfitFeatureOpenTop) },
    goldPoints = 2.gp
)