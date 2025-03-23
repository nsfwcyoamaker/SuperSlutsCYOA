package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class LeveledChoiceView(
    @Stable
    val mainChoice: LeveledChoiceState,
    @Stable
    val drawback: com.freakycyoas.supersluts.model.ChoiceState?,
)