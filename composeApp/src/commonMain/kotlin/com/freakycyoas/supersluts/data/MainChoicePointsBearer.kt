package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.model.*

@Stable
@Immutable
class MainChoicePointsBearer(
    val powerPoints: PowerPoints?,
    val goldPoints: GoldPoints?,
    val outfitGoldPoints: GoldPoints?,
    val fatePoints: FatePoints?
): PointsBearerItem {
    @Stable override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = powerPoints ?: 0.pp
    @Stable override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = goldPoints ?: 0.gp
    @Stable override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = outfitGoldPoints ?: 0.gp
    @Stable override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = fatePoints ?: 0.fp
}
