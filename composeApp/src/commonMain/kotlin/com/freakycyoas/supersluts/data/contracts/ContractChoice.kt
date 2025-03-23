package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultChoiceDescription
import com.freakycyoas.supersluts.data.MainChoicePointsBearer
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource

@Stable
@Immutable
class ContractChoice(
    @Stable override val image: DrawableResource,
    @Stable override val name: String,
    @Stable val linkedDrawbackChoice: (() -> DrawbackChoice)? = null,
    @Stable val text: AnnotatedString,
    @Stable val powerPoints: PowerPoints? = null,
    @Stable val goldPoints: GoldPoints? = null,
    @Stable val outfitGoldPoints: GoldPoints? = null,
    @Stable val fatePoints: FatePoints? = null,
    @Stable val requires: (() -> List<Choice>)? = null,
    @Stable val requiresAll: Boolean = true,
    @Stable val incompatibleWith: (() -> List<Choice>)? = null,
): MainChoice,
    ActivableItem by ContractsActivableChoice(
        requires,
        requiresAll,
        incompatibleWith
    ),
    DescriptableItem by DefaultChoiceDescription(powerPoints, goldPoints, outfitGoldPoints, fatePoints, requires, requiresAll, incompatibleWith, text),
    PointsBearerItem by MainChoicePointsBearer(powerPoints, goldPoints, outfitGoldPoints, fatePoints) {

    override fun getLinkedDrawbackChoice(): DrawbackChoice? = linkedDrawbackChoice?.invoke()
}