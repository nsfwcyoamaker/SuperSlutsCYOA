package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.model.*
import kotlin.reflect.KClass

@Immutable
@Stable
class LeveledDrawbackChoicePointsBearer<T: LeveledMainChoice>(
    @Stable val givenPowerPoints: PowerPoints,
    @Stable val linkedMainChoice: () -> KClass<T>,
): PointsBearerItem {
    @Stable private fun isEligibleForBonusPoints(allSelectedChoices: List<Choice>): Boolean {
        return allSelectedChoices.any { it::class == linkedMainChoice() }
    }
    @Stable override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints {
        return givenPowerPoints + if(isEligibleForBonusPoints(allSelectedChoices)) 3.pp else 0.pp
    }
    @Stable override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    @Stable override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    @Stable override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
}
