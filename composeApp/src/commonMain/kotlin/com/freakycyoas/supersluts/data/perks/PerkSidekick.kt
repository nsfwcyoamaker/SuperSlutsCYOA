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
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseSidekickLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.theme.choiceRequirementSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_SIDEKICK

private val descriptionText = AnnotatedString("Want someone who will follow your every command? Then you might want to consider hiring yourself a sidekick! Not only can you boss them around, but you can also use them as your personal cum dumpster. They will be legally obligated to follow all of your orders. Choose 1 member of your team, they will become your sidekick. This option's cost is equal to the cost of your sidekick's cost. This option is free if your sidekick has a green dot in the top right corner in their description.")
private val incompatibilities = listOf(SuperheroLicenseSidekickLicense)

//TODO sidekick selection

@Immutable
@Stable
object PerkSidekick: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_SIDEKICK,
    name = "SIDEKICK",
    text = descriptionText,
    incompatibleWith = { incompatibilities },
) {
    @Stable
    override val description: AnnotatedString
        get() = getChoiceDescription(
            gainsAndCosts = GainsAndCosts(
                gains = listOf(AnnotatedString("?", spanStyle = goldPointsStyle))
            ),
            requirementsAndIncompatibilities = RequirementsAndIncompatibilities(
                incompatible = incompatibilities.map {
                    buildAnnotatedString {
                        withStyle(choiceRequirementSpanStyle) {
                            append(it.name)
                        }
                    }
                }
            ),
            description = descriptionText,
        )
}

