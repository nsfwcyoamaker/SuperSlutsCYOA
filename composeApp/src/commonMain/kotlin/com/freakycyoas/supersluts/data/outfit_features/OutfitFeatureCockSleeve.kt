package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultActivableChoice
import com.freakycyoas.supersluts.data.GainsAndCosts
import com.freakycyoas.supersluts.data.RequirementsAndIncompatibilities
import com.freakycyoas.supersluts.data.genitals.*
import com.freakycyoas.supersluts.data.getChoiceDescription
import com.freakycyoas.supersluts.data.outfit_design.OutfitDesignNude
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_COCK_SLEEVE

private val requirements = listOf(GenitalsSmallPenis, GenitalsMediumPenis, GenitalsLargePenis, GenitalsBigPenis, GenitalsSuperPenis)
private val shownIncompatibilities = listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, SponsorSexySecret, OutfitFeatureAntiBulgeHammerspace)

private val gain = 3.gp

@Immutable
@Stable
object OutfitFeatureCockSleeve: MainChoice {
    @Stable
    override val image: DrawableResource
        get() = Res.drawable.outfit_features_COCK_SLEEVE
    @Stable
    override val name: String
        get() = "COCK SLEEVE"
    @Stable
    override val description: AnnotatedString
        get() = getChoiceDescription(
            gainsAndCosts = GainsAndCosts.fromPoints(goldPoints = gain),
            requirementsAndIncompatibilities = RequirementsAndIncompatibilities
                .fromChoices(incompatible = shownIncompatibilities)
                .copy(requires = listOf(AnnotatedString("Got a penis"))),
            description = AnnotatedString("Do you want your fans to admire your penis? Then you should totally wear a tight-fitting cock sock so that everyone may gaze at it! Note that you can’t wear the cock sleeve underneath your outfit like some kind of underwear."),
        )

    @Stable
    override fun getLinkedDrawbackChoice(): DrawbackChoice? = null

    @Stable
    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = 0.pp

    @Stable
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = gain

    @Stable
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp

    @Stable
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp

    @Stable
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean {
        val canBeTaken by lazy {
            DefaultActivableChoice(
                requires = { requirements },
                requiresAll = false,
                incompatibleWith = { shownIncompatibilities }
            ).canBeTaken(allSelectedChoices)
        }

        val cockExposed by lazy {
            allSelectedChoices.contains(OutfitDesignNude) ||
                    allSelectedChoices.contains(OutfitFeatureTransparent) ||
                    allSelectedChoices.contains(OutfitFeatureOpenBottom) ||
                    allSelectedChoices.contains(OutfitFeatureCrotchWindow)
        }

        return canBeTaken && cockExposed
    }
}