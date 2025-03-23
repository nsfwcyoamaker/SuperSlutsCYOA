package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.breast_size.BreastSizeFuckableNipples
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_NIPPLE_PLUGS

@Immutable
@Stable
object OutfitFeatureNipplePlugs: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_NIPPLE_PLUGS,
    name = "NIPPLE PLUGS",
    text = buildAnnotatedString {
        append("How about some nipple plugs to decorate your nipples with? If your nipple plugs are visible on your outfit, you will gain ")
        withStyle(goldPointsStyle) { append("5") }
        append(" extra ")
        withStyle(goldPointsStyle) { append("Gold Points") }
        append(" from this option.")
    },
    requires = { listOf(com.freakycyoas.supersluts.data.breast_size.BreastSizeFuckableNipples) },
    incompatibleWith = { listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, SponsorSexySecret) },
    goldPoints = 5.gp
) {
    @Stable
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        val nipplesExposed by lazy {
            if(allSelectedChoices.contains(OutfitDesignNude))
                return@lazy true

            if(allSelectedChoices.contains(OutfitFeatureTransparent))
                return@lazy true

            val openTopSelected = allSelectedChoices.contains(OutfitFeatureOpenTop)
            val pastiesSelected = allSelectedChoices.contains(OutfitFeaturePasties)

            openTopSelected && !pastiesSelected
        }

        return if(nipplesExposed) return 10.gp else 5.gp
    }
}