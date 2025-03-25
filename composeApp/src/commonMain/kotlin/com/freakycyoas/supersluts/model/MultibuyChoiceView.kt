package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class MultibuyChoiceView(
    @Stable
    val mainChoice: MultibuyChoiceState,
    @Stable
    val drawback: ChoiceState?,
)
