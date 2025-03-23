package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.data.DefaultActivableChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorNoSponsor
import com.freakycyoas.supersluts.model.ActivableItem
import com.freakycyoas.supersluts.model.Choice

@Immutable
@Stable
class ContractsActivableChoice(
    @Stable val requires: (() -> List<Choice>)? = null,
    @Stable val requiresAll: Boolean = true,
    @Stable val incompatibleWith: (() -> List<Choice>)? = null,
): ActivableItem {
    val defaultBehavior = DefaultActivableChoice(requires, requiresAll, incompatibleWith)

    @Stable override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean {
        return !allSelectedChoices.contains(SponsorNoSponsor) && defaultBehavior.canBeTaken(allSelectedChoices)
    }
}