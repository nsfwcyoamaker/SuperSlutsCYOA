package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource

class OutfitEnhancedPower(
    val power: LeveledMainChoice,
): LeveledMainChoice {
    override fun ofLevel(level: ChoiceLevel): LeveledMainChoice { return this }
    override val levels: List<ChoiceLevel> = emptyList()
    override val selectedLevel: Int = 2
    override fun getLinkedDrawbackChoice(): DrawbackChoice? = null
    override val name: String = power.name
    override val image: DrawableResource = power.image
    override val description: AnnotatedString = power.description
    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = 0.pp
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean {
        return allSelectedChoices
            .filterIsInstance<LeveledMainChoice>()
            .singleOrNull { choice -> choice::class == power::class }
            ?.let { it.selectedLevel == 1 }
            ?: false
    }
}