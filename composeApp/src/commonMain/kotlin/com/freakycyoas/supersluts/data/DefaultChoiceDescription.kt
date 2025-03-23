package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.*

class DefaultChoiceDescription(
    powerPoints: PowerPoints? = null,
    goldPoints: GoldPoints? = null,
    outfitGoldPoints: GoldPoints? = null,
    fatePoints: FatePoints? = null,
    requires: (() -> List<Choice>)? = null,
    requiresAll: Boolean = true,
    incompatibleWith: (() -> List<Choice>)? = null,
    text: AnnotatedString,
): DescriptableItem {
    @Stable
    override val description: AnnotatedString by lazy {
        getChoiceDescription(
            powerPoints = powerPoints,
            goldPoints = goldPoints + outfitGoldPoints,
            fatePoints = fatePoints,
            description = text,
            incompatible = incompatibleWith?.invoke() ?: emptyList(),
            requires = requires?.invoke() ?: emptyList(),
            requiresAll = requiresAll,
        )
    }
}