package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class ChoiceState(
    @Stable
    val choice: Choice,
    @Stable
    val isSelected: Boolean,
    @Stable
    val isEnabled: Boolean,
)