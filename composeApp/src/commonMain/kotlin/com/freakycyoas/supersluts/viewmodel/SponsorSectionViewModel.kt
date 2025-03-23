package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.sponsor.ExchangedPowerPoints
import com.freakycyoas.supersluts.data.sponsor.SponsorChoicesGroup
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.model.pp
import kotlinx.coroutines.flow.map

class SponsorSectionViewModel: SimpleSectionViewModel(SponsorChoicesGroup) {
    val exchangedPowerPoints by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            allChoices.filterIsInstance<ExchangedPowerPoints>()
                .singleOrNull()
                ?.let {
                    it.powerPoints to it.grantedGoldPoints(allChoices)
                } ?: (0.pp to 0.gp)
        }
    }

    fun incrementPowerPointsExchanged() {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let { allChoices ->
            allChoices
                .filter { it !is ExchangedPowerPoints }
                .plus(
                    allChoices
                        .filterIsInstance<ExchangedPowerPoints>()
                        .singleOrNull()
                        ?.let { ExchangedPowerPoints((it.powerPoints.amount + 2).pp) }
                        ?: ExchangedPowerPoints(2.pp)
                )
        }
    }

    fun decrementPowerPointsExchanged() {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let { allChoices ->
            allChoices
                .filter { it !is ExchangedPowerPoints }
                .plus(
                    allChoices
                        .filterIsInstance<ExchangedPowerPoints>()
                        .singleOrNull()
                        ?.let { ExchangedPowerPoints(((it.powerPoints.amount - 2).coerceAtLeast(0)).pp) }
                        ?: ExchangedPowerPoints(0.pp)
                )
        }
    }
}