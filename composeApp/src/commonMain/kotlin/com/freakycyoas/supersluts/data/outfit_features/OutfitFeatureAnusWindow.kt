package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultActivableChoice
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_ANUS_WINDOW

private val incompatibilities = listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, SponsorSexySecret, OutfitDesignNude, OutfitFeatureOpenBottom, OutfitFeatureThong, OutfitFeatureButtWindows)

@Immutable
@Stable
object OutfitFeatureAnusWindow: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_ANUS_WINDOW,
    name = "ANUS WINDOW",
    text = AnnotatedString("If you like anal we could decorate your outfit with a functional and stylish window for your asshole."),
    incompatibleWith = { incompatibilities },
    goldPoints = 6.gp
) {
    @Stable
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean {
        return if(allSelectedChoices.contains(OutfitFeaturePasties)) {
            DefaultActivableChoice(
                incompatibleWith = { incompatibilities.minus(SponsorSexySecret) }
            ).canBeTaken(allSelectedChoices)
        } else {
            DefaultActivableChoice(
                incompatibleWith = { incompatibilities }
            ).canBeTaken(allSelectedChoices)
        }
    }
}