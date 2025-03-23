package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource

@Stable
@Immutable
class DefaultLeveledMainChoice(
    @Stable override val image: DrawableResource,
    @Stable override val name: String,
    @Stable val linkedDrawbackChoice: (() -> DrawbackChoice)? = null,
    @Stable val requires: (() -> List<Choice>)? = null,
    @Stable val requiresAll: Boolean = true,
    @Stable val incompatibleWith: (() -> List<Choice>)? = null,

    @Stable val constructor: (Int) -> LeveledMainChoice,
    @Stable override val levels: List<PowerLevel>,
    @Stable override val selectedLevel: Int?,
): LeveledMainChoice,
    ActivableItem by DefaultActivableChoice(requires, requiresAll, incompatibleWith),
    PointsBearerItem by LeveledChoicePointsBearer(levels, selectedLevel) {

    @Stable override val description: AnnotatedString = getChoiceDescription(
        requires = requires?.invoke() ?: emptyList(),
        requiresAll = requiresAll,
        incompatible = incompatibleWith?.invoke() ?: emptyList(),
        description = AnnotatedString("")
    )

    init {
        if(selectedLevel != null) {
            require(selectedLevel in (1..3))
        }
    }

    @Stable override fun ofLevel(level: ChoiceLevel): LeveledMainChoice = constructor(level.number)
    @Stable override fun getLinkedDrawbackChoice(): DrawbackChoice? = linkedDrawbackChoice?.invoke()
}