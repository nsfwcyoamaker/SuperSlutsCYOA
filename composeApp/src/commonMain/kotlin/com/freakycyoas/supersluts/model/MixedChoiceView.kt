package com.freakycyoas.supersluts.model

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
@Stable
sealed class MixedChoiceView {
    @Immutable
    @Stable
    data class Simple(val choiceView: com.freakycyoas.supersluts.model.ChoiceView): MixedChoiceView()
    @Immutable
    @Stable
    data class Leveled(val leveledChoiceView: LeveledChoiceView): MixedChoiceView()
    @Immutable
    @Stable
    data class Multibuy(val multibuyChoiceView: MultibuyChoiceView): MixedChoiceView()
    @Immutable
    @Stable
    data class Multiselect(val multiselectChoiceView: MultiselectChoiceView): MixedChoiceView()
}