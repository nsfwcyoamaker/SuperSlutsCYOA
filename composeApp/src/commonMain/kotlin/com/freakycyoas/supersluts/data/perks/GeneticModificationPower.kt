package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledChoicePointsBearer
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource
import kotlin.math.floor

class GeneticModificationPower private constructor(
    val power: LeveledMainChoice,
    levels: List<PowerLevel>,
): LeveledMainChoice,
    PointsBearerItem by LeveledChoicePointsBearer(levels, power.selectedLevel) {

    constructor(
        power: LeveledMainChoice,
    ): this(
        power,
        power.levels.map { level ->
            (level as PowerLevel).copy(
                powerPoints = null,
                goldPoints = level.powerPoints?.amount?.let { floor(it.toDouble() / 2.0).toInt() }?.gp,
            )
        }
    )

    @Stable override val levels: List<ChoiceLevel> = levels
    @Stable override val name: String = power.name
    @Stable override val image: DrawableResource = power.image
    @Stable override val description: AnnotatedString = power.description
    @Stable override val selectedLevel: Int? = power.selectedLevel

    @Stable override fun ofLevel(level: ChoiceLevel): GeneticModificationPower = GeneticModificationPower(power.ofLevel(level))

    @Stable override fun getLinkedDrawbackChoice(): DrawbackChoice? = null

    @Stable override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean {
        return allSelectedChoices.none { it::class == power::class }
    }
}