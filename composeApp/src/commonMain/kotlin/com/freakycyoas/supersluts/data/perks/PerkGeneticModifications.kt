package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.GainsAndCosts
import com.freakycyoas.supersluts.data.RequirementsAndIncompatibilities
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.getChoiceDescription
import com.freakycyoas.supersluts.data.powers.PowersAmphibic
import com.freakycyoas.supersluts.data.powers.PowersFlight
import com.freakycyoas.supersluts.data.powers.PowersNaturalWeapon
import com.freakycyoas.supersluts.data.powers.PowersRegeneration
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.MultiselectMainChoice
import com.freakycyoas.supersluts.theme.choiceRequirementSpanStyle
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_GENETIC_MODIFICATIONS

private val descriptionText = buildAnnotatedString {
    append("For a price, Dawn Genetics would love to make some genetic enhancements on you. Choose any level of either")
    withStyle(choiceSubtitleSpanStyle) { append("Amphibic") }
    append(", ")
    withStyle(choiceSubtitleSpanStyle) { append("Flight") }
    append(", ")
    withStyle(choiceSubtitleSpanStyle) { append("Natural Weapon") }
    append(" or ")
    withStyle(choiceSubtitleSpanStyle) { append("Regeneration") }
    append(". You gain that superpower as a mutation, if you choose ")
    withStyle(choiceSubtitleSpanStyle) { append("Amphibic") }
    append(" you will gain gills, if you choose ")
    withStyle(choiceSubtitleSpanStyle) { append("Flight") }
    append(" you will gain wings and if you choose ")
    withStyle(choiceSubtitleSpanStyle) { append("Regeneration") }
    append(" your blood gain an unnatural color. The ")
    withStyle(goldPointsStyle) { append("Gold point") }
    append(" cost of this option is equal to half the cost of the superpower you chose rounded up. You may purchase this option multiple times.")
}
private val requirements = listOf(SponsorDawnGenetics)

@Immutable
@Stable
class PerkGeneticModifications: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_GENETIC_MODIFICATIONS,
    name = "GENETIC MODIFICATIONS",
    text = descriptionText,
    requires = { requirements },
), MultiselectMainChoice {
    @Stable
    override val description: AnnotatedString
        get() = getChoiceDescription(
            gainsAndCosts = GainsAndCosts(
                gains = listOf(AnnotatedString("?", spanStyle = goldPointsStyle))
            ),
            requirementsAndIncompatibilities = RequirementsAndIncompatibilities(
                requires = requirements.map {
                    buildAnnotatedString {
                        withStyle(choiceRequirementSpanStyle) {
                            append(it.name)
                        }
                    }
                },
            ),
            description = descriptionText,
        )

    override fun getSelectedChoices(allChoice: List<Choice>): List<GeneticModificationPower> {
        return allChoice.filterIsInstance<GeneticModificationPower>()
    }

    override fun getPossibleSelections(allChoice: List<Choice>): List<GeneticModificationPower> {
        val selectedChoices = getSelectedChoices(allChoice)
        return listOfNotNull(
            PowersAmphibic(selectedLevel = 1).takeIf { selectedChoices.none { it.power is PowersAmphibic } }?.let { GeneticModificationPower(it) },
            PowersFlight(selectedLevel = 1).takeIf { selectedChoices.none { it.power is PowersFlight } }?.let { GeneticModificationPower(it) },
            PowersRegeneration(selectedLevel = 1).takeIf { selectedChoices.none { it.power is PowersRegeneration } }?.let { GeneticModificationPower(it) },
            GeneticModificationPower(PowersNaturalWeapon(selectedLevel = 1)),
        )
    }
}