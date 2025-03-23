package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_CAPE

@Stable
@Immutable
object OutfitFeatureCape: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_CAPE,
    name = "CAPE",
    text = AnnotatedString("How about a cape? Capes are flashy outfit accessories that are iconic to superheroes. While capes are highly impractical to wear, they are more of a status symbol than anything else. Like you’re so strong you can wear a cape and get away with it."),
    goldPoints = 2.gp,
)