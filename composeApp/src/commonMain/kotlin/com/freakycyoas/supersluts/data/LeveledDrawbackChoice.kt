package com.freakycyoas.supersluts.data

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource
import kotlin.reflect.KClass

@Stable
@Immutable
class LeveledDrawbackChoice<T: LeveledMainChoice>(
    @Stable override val image: DrawableResource,
    @Stable override val name: String,
    @Stable val text: AnnotatedString,
    @Stable val givenPowerPoints: PowerPoints,
    @Stable val requires: (() -> List<Choice>)? = null,
    @Stable val requiresAll: Boolean = true,
    @Stable val incompatibleWith: (() -> List<Choice>)? = null,
    @Stable val linkedMainChoice: () -> KClass<T>,
): DrawbackChoice,
    PointsBearerItem by LeveledDrawbackChoicePointsBearer(givenPowerPoints, linkedMainChoice),
    ActivableItem by DefaultActivableChoice(requires, requiresAll, incompatibleWith),
    DescriptableItem by DefaultChoiceDescription(givenPowerPoints, null, null, null, requires, requiresAll, incompatibleWith, text) {
    @Stable override fun getLinkedMainChoices(): List<KClass<out LeveledMainChoice>> = listOf(linkedMainChoice())
}