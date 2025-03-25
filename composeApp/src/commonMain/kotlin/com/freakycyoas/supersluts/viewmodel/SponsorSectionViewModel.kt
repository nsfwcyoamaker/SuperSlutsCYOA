package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.sponsor.SponsorChoicesGroup
import com.freakycyoas.supersluts.data.sponsor.SponsorExchangedPowerPoints
import kotlinx.coroutines.flow.map

class SponsorSectionViewModel: SimpleSectionViewModel(SponsorChoicesGroup) {
    val sponsorExchangedPowerPoints by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            allChoices
                .filterIsInstance<SponsorExchangedPowerPoints>()
                .singleOrNull()
                ?: SponsorExchangedPowerPoints(0)
        }
    }

    fun powerPointsExchangeAmountChanged(amount: Int) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices
            .filter { it !is SponsorExchangedPowerPoints }
            .plus(SponsorExchangedPowerPoints(amount))
    }
}