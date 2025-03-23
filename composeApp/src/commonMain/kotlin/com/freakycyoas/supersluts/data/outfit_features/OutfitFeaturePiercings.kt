package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_PIERCINGS

@Immutable
@Stable
object OutfitFeaturePiercings: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_PIERCINGS,
    name = "PIERCINGS",
    text = AnnotatedString("Adding piercings to your outfit is a great way to give you the bad girl or bad boy look. The piercings can be anything from nipple piercings to a lip piercing, but the piercings must be visible."),
    incompatibleWith = { listOf(SponsorWaltDisney) },
    goldPoints = 2.gp
)