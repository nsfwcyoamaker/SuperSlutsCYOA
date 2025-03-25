package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class ChoiceView(
    @Stable
    val mainChoice: ChoiceState,
    @Stable
    val drawback: ChoiceState? = null,
)