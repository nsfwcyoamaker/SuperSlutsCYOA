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
    @Stable override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = selectedLevel?.let { levels.single { it.number == selectedLevel }.powerPoints } ?: 0.pp
    @Stable override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = selectedLevel?.let { levels.single { it.number == selectedLevel }.goldPoints } ?: 0.gp
    @Stable override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = selectedLevel?.let { levels.single { it.number == selectedLevel }.outfitGoldPoints } ?: 0.gp
    @Stable override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = selectedLevel?.let { levels.single { it.number == selectedLevel }.fatePoints } ?: 0.fp
}
