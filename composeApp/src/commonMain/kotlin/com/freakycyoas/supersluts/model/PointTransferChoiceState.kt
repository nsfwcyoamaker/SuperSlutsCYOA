package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class PointTransferChoiceState(
    @Stable
    val choice: PointTransferMainChoice,
    @Stable
    val isSelected: Boolean,
    @Stable
    val isEnabled: Boolean,
    @Stable
    val amount: Int,
    @Stable
    val consumedPoints: Points,
    @Stable
    val gainedPoints: Points,
)