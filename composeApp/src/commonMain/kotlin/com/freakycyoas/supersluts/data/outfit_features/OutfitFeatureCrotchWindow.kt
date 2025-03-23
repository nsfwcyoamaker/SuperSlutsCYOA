package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultActivableChoice
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignDress
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_CROTCH_WINDOW

private val incompatibilities = listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, SponsorSexySecret, OutfitDesignNude, OutfitDesignDress, OutfitFeatureCamelString, OutfitFeatureOpenBottom)

@Immutable
@Stable
object OutfitFeatureCrotchWindow: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_CROTCH_WINDOW,
    name = "CROTCH WINDOW",
    text = AnnotatedString("Why don't you show the world what you got down there with a super sexy window for your crotch? It's very practical if you plan to fuck a lot."),
    incompatibleWith = { incompatibilities },
    goldPoints = 3.gp
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