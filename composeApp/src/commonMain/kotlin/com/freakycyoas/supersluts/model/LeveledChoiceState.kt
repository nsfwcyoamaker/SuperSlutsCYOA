package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class LeveledChoiceState(
    @Stable
    val choice: LeveledMainChoice,
    @Stable
    val selectedLevel: Int?,
    @Stable
    val isEnabled: Boolean,
)