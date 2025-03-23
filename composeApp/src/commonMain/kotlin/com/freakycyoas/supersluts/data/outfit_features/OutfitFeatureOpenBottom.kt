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
import superslutscyoa.composeapp.generated.resources.outfit_features_OPEN_BOTTOM

private val incompatibilities = listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, SponsorSexySecret, OutfitDesignNude, OutfitFeatureCamelString, OutfitFeatureCrotchWindow)

@Immutable
@Stable
object OutfitFeatureOpenBottom: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_OPEN_BOTTOM,
    name = "OPEN BOTTOM",
    text = AnnotatedString("On second thought why wear anything at all down there? You're perfect just the way you are!"),
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