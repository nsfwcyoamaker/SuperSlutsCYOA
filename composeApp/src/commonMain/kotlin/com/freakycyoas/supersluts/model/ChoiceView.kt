package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class ChoiceView(
    @Stable
    val mainChoice: com.freakycyoas.supersluts.model.ChoiceState,
    @Stable
    val drawback: com.freakycyoas.supersluts.model.ChoiceState? = null,
)