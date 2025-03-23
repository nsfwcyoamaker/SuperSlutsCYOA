package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.utils.containsAny

@Immutable
@Stable
class DrawbackChoicePointsBearer(
    @Stable val givenPowerPoints: PowerPoints,
    @Stable val linkedMainChoices: () -> List<MainChoice>,
): PointsBearerItem {
    @Stable private fun isEligibleForBonusPoints(allSelectedChoices: List<Choice>): Boolean {
        return allSelectedChoices.containsAny(linkedMainChoices())
    }
    @Stable override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints {
        return givenPowerPoints + if(isEligibleForBonusPoints(allSelectedChoices)) 3.pp else 0.pp
    }
    @Stable override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    @Stable override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    @Stable override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
}
