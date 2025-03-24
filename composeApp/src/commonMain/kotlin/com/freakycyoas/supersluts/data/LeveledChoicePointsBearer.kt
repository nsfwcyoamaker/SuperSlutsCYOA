package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.model.*

@Stable
@Immutable
class LeveledChoicePointsBearer(
    @Stable val levels: List<ChoiceLevel>,
    @Stable val selectedLevel: Int?
): PointsBearerItem {
    val level: ChoiceLevel? = selectedLevel?.let { levels.single { it.number == selectedLevel } }
    @Stable override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = level?.powerPoints ?: 0.pp
    @Stable override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = level?.goldPoints ?: 0.gp
    @Stable override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = level?.outfitGoldPoints ?: 0.gp
    @Stable override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = level?.fatePoints ?: 0.fp
}
