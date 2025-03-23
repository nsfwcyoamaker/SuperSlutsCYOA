package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_HIGH_HEELS

@Stable
@Immutable
object OutfitFeatureHighHeels: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_HIGH_HEELS,
    name = "HIGH HEELS",
    text = AnnotatedString("High heels might not be the most practical thing to wear as a superhero, but it totally is the most stylish thing to wear. Wearing high heels will accentuating your calf muscles and make your legs look longer. Basically wearing high heels will give you killer legs and make your fans happy."),
    goldPoints = 3.gp
)