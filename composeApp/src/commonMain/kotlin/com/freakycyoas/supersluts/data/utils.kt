package com.freakycyoas.supersluts.data

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.choiceDescriptionStyle
import com.freakycyoas.supersluts.theme.choiceRequirementSpanStyle
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.choiceTitleParagraphStyle

fun getChoiceDescription(
    powerPoints: PowerPoints? = null,
    goldPoints: GoldPoints? = null,
    fatePoints: FatePoints? = null,
    requires: List<Choice> = emptyList(),
    requiresAll: Boolean = true,
    incompatible: List<Choice> = emptyList(),
    description: AnnotatedString,
): AnnotatedString {
    return getChoiceDescription(
        gainsAndCosts = GainsAndCosts.fromPoints(powerPoints, goldPoints, fatePoints),
        requirementsAndIncompatibilities = RequirementsAndIncompatibilities.fromChoices(requires, requiresAll, incompatible),
        description = description
    )
}

data class GainsAndCosts(
    val gains: List<AnnotatedString> = emptyList(),
    val costs: List<AnnotatedString> = emptyList(),
) {
    companion object {
        fun fromPoints(
            powerPoints: PowerPoints? = null,
            goldPoints: GoldPoints? = null,
            fatePoints: FatePoints? = null,
        ): GainsAndCosts {
            val points = listOfNotNull(powerPoints, goldPoints, fatePoints)

            val gains = points
                .filter { it.amount >= 0 }
                .map { AnnotatedString("+${it.amount}", spanStyle = it.style) }

            val costs = points
                .filter { it.amount < 0 }
                .map { AnnotatedString("${it.amount}", spanStyle = it.style) }

            return GainsAndCosts(gains = gains, costs = costs)
        }
    }
}

data class RequirementsAndIncompatibilities(
    val requires: List<AnnotatedString> = emptyList(),
    val requiresAll: Boolean = true,
    val incompatible: List<AnnotatedString> = emptyList(),
) {
    companion object {
        fun fromChoices(
            requires: List<Choice> = emptyList(),
            requiresAll: Boolean = true,
            incompatible: List<Choice> = emptyList(),
        ): RequirementsAndIncompatibilities {
            return RequirementsAndIncompatibilities(
                requires = requires.map { requirement ->
                    buildAnnotatedString {
                        withStyle(choiceRequirementSpanStyle) {
                            append(requirement.name)
                        }

                        if(requirement is LeveledMainChoice && requirement.selectedLevel != null) {
                            append(" Level ${requirement.selectedLevel} or Higher")
                        }
                    }
                },
                requiresAll = requiresAll,
                incompatible = incompatible.map { incompatibility ->
                    buildAnnotatedString {
                        withStyle(choiceRequirementSpanStyle) {
                            append(incompatibility.name)
                        }
                    }
                }
            )
        }
    }
}

fun getChoiceDescription(
    gainsAndCosts: GainsAndCosts = GainsAndCosts(),
    requirementsAndIncompatibilities: RequirementsAndIncompatibilities = RequirementsAndIncompatibilities(),
    description: AnnotatedString,
): AnnotatedString {
    val (gains, costs) = gainsAndCosts
    val (requires, requiresAll, incompatible) = requirementsAndIncompatibilities

    return buildAnnotatedString {
        if(requires.isNotEmpty() || incompatible.isNotEmpty() || costs.isNotEmpty() || gains.isNotEmpty()) {
            pushStyle(choiceTitleParagraphStyle)
            pushStyle(choiceSubtitleSpanStyle)

            if(requires.isNotEmpty() || incompatible.isNotEmpty()) {
                append("Requirement: ")
                if(requires.isNotEmpty()) {
                    val requirementsJoiner = if(requiresAll) " and " else " or "
                    requires.forEachIndexed { index, requirement ->
                        append(requirement)
                        if(index != requires.lastIndex) {
                            append(requirementsJoiner)
                        }
                    }

                    if(incompatible.isNotEmpty()) {
                        append(", ")
                    }
                }

                if(incompatible.isNotEmpty()) {
                    incompatible.forEachIndexed { index, incompatibility ->
                        append("NOT ")
                        append(incompatibility)
                        if(index != incompatible.lastIndex) {
                            append(" and ")
                        }
                    }
                }
                append(".")
            }

            if((requires.isNotEmpty() || incompatible.isNotEmpty()) && (gains.isNotEmpty() || costs.isNotEmpty())) {
                append("\n")
            }

            if(gains.isNotEmpty() || costs.isNotEmpty()) {
                if(gains.isNotEmpty()) {
                    append("Gain: ")
                    gains.forEachIndexed { index, text ->
                        append(text)
                        if(index != gains.lastIndex) {
                            append(", ")
                        }
                    }
                }

                if(gains.isNotEmpty() && costs.isNotEmpty()) {
                    append("\n")
                }

                if(costs.isNotEmpty()) {
                    append("Cost: ")
                    costs.forEachIndexed { index, text ->
                        append(text)
                        if(index != costs.lastIndex) {
                            append(", ")
                        }
                    }
                }
            }

            pop()
            pop()
        }
        withStyle(choiceDescriptionStyle) {
            append(description)
        }
    }
}

val List<MainChoice>.withDrawbacks: List<Choice>
    get() = map { listOfNotNull(it, it.getLinkedDrawbackChoice()) }.flatten()