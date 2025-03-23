package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class MultibuyChoiceState(
    @Stable
    val choice: MultibuyMainChoice,
    @Stable
    val boughtTimes: Int,
    @Stable
    val isEnabled: Boolean,
)