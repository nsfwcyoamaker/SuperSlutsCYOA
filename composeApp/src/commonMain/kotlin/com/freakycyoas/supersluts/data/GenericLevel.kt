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
data class GenericLevel(
    @Stable override val number: Int,
    @Stable override val powerPoints: PowerPoints? = null,
    @Stable override val goldPoints: GoldPoints? = null,
    @Stable override val outfitGoldPoints: GoldPoints? = null,
    @Stable override val fatePoints: FatePoints? = null,
    @Stable override val description: AnnotatedString
): ChoiceLevel
