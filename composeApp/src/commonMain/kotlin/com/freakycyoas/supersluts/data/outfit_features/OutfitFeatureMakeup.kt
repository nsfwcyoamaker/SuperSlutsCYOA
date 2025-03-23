package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_MAKEUP

@Stable
@Immutable
object OutfitFeatureMakeup: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_MAKEUP,
    name = "MAKEUP",
    text = AnnotatedString("Adding some makeup to your look can do wonders! And remember makeup is not limited to your face, we can incorporate bodypaint into your outfit and give you a really special look."),
    goldPoints = 2.gp,
)