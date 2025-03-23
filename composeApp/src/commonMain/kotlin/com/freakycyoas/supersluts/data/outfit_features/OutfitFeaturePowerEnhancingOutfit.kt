package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.powers.PowersChoicesGroup
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_POWER_ENHANCING_OUTFIT

class OutfitFeaturePowerEnhancingOutfit(
    override val selectedChoices: List<Choice> = emptyList()
): MultiselectMainChoice,
    MainChoice by SimpleMainChoice(
        image = Res.drawable.outfit_features_POWER_ENHANCING_OUTFIT,
        name = "POWER ENHANCING OUTFIT",
        text = buildAnnotatedString {
            append("Your outfit could be designed to amplify 1 of your level 1 powers to level 2 for as long as you wear your outfit. Note that if your outfit is severely damaged it will stop amplifying your power. You may purchase this option multiple times and if your sponsor is ")
            withStyle(choiceSubtitleSpanStyle) { append("Dawn Genetics") }
            append(" this option costs ")
            withStyle(goldPointsStyle) { append("5 Gold Points") }
            append(" less.")
        },
        outfitGoldPoints = baseCost,
    ),
    PointsBearerItem {

    companion object {
        private val baseCost = (-15).gp
        private val dawnGeneticsDiscountedCost = (-5).gp
    }

    override fun getPossibleSelections(allChoice: List<Choice>): List<Choice> {
        val powers = PowersChoicesGroup.choices.map { power -> power::class }
        return allChoice
            .filterIsInstance<LeveledMainChoice>()
            .filter { choice -> choice::class in powers }
            .filter { power -> power.selectedLevel == 1 }
            .minus(selectedChoices)
    }

    override fun ofSelections(choices: List<Choice>): MultiselectMainChoice {
        return OutfitFeaturePowerEnhancingOutfit(choices)
    }

    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean =
        selectedChoices.isNotEmpty() || getPossibleSelections(allSelectedChoices).isNotEmpty()

    override fun getLinkedDrawbackChoice(): DrawbackChoice? = null

    @Stable
    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = 0.pp

    @Stable
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp

    @Stable
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        val cost = if(allSelectedChoices.any { it is SponsorDawnGenetics }) {
            dawnGeneticsDiscountedCost
        } else {
            baseCost
        }

        return cost * selectedChoices.size
    }

    @Stable
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
}