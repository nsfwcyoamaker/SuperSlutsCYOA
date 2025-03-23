package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.ChoiceLevel
import com.freakycyoas.supersluts.model.FatePoints
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.PowerPoints

@Stable
@Immutable
data class OutfitGoldLevel(
    @Stable override val number: Int,
    @Stable override val outfitGoldPoints: GoldPoints,
    @Stable override val description: AnnotatedString
): ChoiceLevel {
    @Stable
    override val powerPoints: PowerPoints? get() = null
    @Stable
    override val goldPoints: GoldPoints? get() = null
    @Stable
    override val fatePoints: FatePoints? get() = null
}