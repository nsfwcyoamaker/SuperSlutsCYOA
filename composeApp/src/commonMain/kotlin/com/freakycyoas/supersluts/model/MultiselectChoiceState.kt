package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
data class MultiselectChoiceState(
    @Stable
    val choice: MultiselectMainChoice,
    @Stable
    val selectedChoices: List<com.freakycyoas.supersluts.model.Choice>,
    @Stable
    val selectableChoices: List<com.freakycyoas.supersluts.model.Choice>,
    @Stable
    val isEnabled: Boolean,
)