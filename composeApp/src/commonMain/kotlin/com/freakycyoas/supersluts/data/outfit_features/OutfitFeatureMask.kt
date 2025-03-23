package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_MASK

@Stable
@Immutable
object OutfitFeatureMask: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_MASK,
    name = "MASK",
    text = AnnotatedString("If you wish to have a hidden identity, a mask can be instrumental in protecting your identity. Your mask can be anything from a small domino mask to a full mask. The size of the mask won’t affect its ability to protect your identity."),
    outfitGoldPoints = (-1).gp
)