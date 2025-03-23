package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledChoicePointsBearer
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource

class MinionPower private constructor(
    val power: LeveledMainChoice,
    val maxLevel: Int,
    @Stable override val selectedLevel: Int? = null,
    levels: List<PowerLevel>,
): LeveledMainChoice,
    PointsBearerItem by LeveledChoicePointsBearer(levels, selectedLevel) {

    constructor(
        power: LeveledMainChoice,
        maxLevel: Int,
        selectedLevel: Int? = null
    ): this(
        power,
        maxLevel.coerceIn(1..3),
        selectedLevel?.coerceIn(1..maxLevel),
        power.levels
            .filter{ it.number <= maxLevel }
            .map { (it as PowerLevel).copy(powerPoints = (it.powerPoints.amount / 2).pp) }
    )

    @Stable override val levels: List<ChoiceLevel> = levels
    @Stable override val name: String = power.name
    @Stable override val image: DrawableResource = power.image
    @Stable override val description: AnnotatedString = AnnotatedString("")

    @Stable override fun ofLevel(level: ChoiceLevel): MinionPower = MinionPower(power, maxLevel, level.number)

    @Stable override fun getLinkedDrawbackChoice(): DrawbackChoice? = null

    @Stable override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean = allSelectedChoices.any { it::class == PowersSummonMinion::class }
}