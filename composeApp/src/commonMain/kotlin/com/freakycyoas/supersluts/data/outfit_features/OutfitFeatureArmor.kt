package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.*
import com.freakycyoas.supersluts.data.powers.PowersSuperhumanDurability
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import org.jetbrains.compose.resources.DrawableResource
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_ARMOR
import kotlin.math.floor

@Stable
@Immutable
class OutfitFeatureArmor(
    override val selectedLevel: Int? = null,
): LeveledMainChoice,
    ActivableItem,
    DescriptableItem,
    PointsBearerItem {

    init {
        if(selectedLevel != null) {
            require(selectedLevel in (1..3))
        }
    }

    @Stable
    override val name: String
        get() = "ARMOR"
    @Stable
    override val image: DrawableResource
        get() = Res.drawable.outfit_features_ARMOR
    @Stable
    override val description: AnnotatedString
        get() = getChoiceDescription(
            gainsAndCosts = GainsAndCosts(
                gains = listOf(AnnotatedString("?", spanStyle = goldPointsStyle))
            ),
            description = buildAnnotatedString {
                append("Armor is both functional and fashionable! Your armor could be anything from a high tech mini mecha suit to a more classic knight's armor. Choose a level of ")
                withStyle(choiceSubtitleSpanStyle) { append("Superhuman Durability") }
                append(" which will determine the durability of your armor. The ")
                withStyle(goldPointsStyle) { append("Gold Point") }
                append(" cost of this option is equal to half the cost of the level of ")
                withStyle(choiceSubtitleSpanStyle) { append("Superhuman Durability") }
                append(" you chose.")
            },
        )

    @Stable
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean = true

    @Stable
    override fun getLinkedDrawbackChoice(): DrawbackChoice? = null

    @Stable
    override fun ofLevel(level: ChoiceLevel): LeveledMainChoice = OutfitFeatureArmor(level.number)

    @Stable
    override val levels: List<ChoiceLevel> = PowersSuperhumanDurability(null)
        .levels
        .map {
            (it as com.freakycyoas.supersluts.data.PowerLevel).let {
                OutfitGoldLevel(
                    number = it.number,
                    outfitGoldPoints = (floor(it.powerPoints.amount.toDouble() / 2.0).toInt()).gp,
                    description = it.description,
                )
            }
        }

    @Stable
    private val leveledPoints = LeveledChoicePointsBearer(levels, selectedLevel)

    @Stable
    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = leveledPoints.grantedPowerPoints(allSelectedChoices)

    @Stable
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = leveledPoints.grantedGoldPoints(allSelectedChoices)

    @Stable
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = leveledPoints.grantedOutfitGoldPoints(allSelectedChoices)

    @Stable
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = leveledPoints.grantedFatePoints(allSelectedChoices)
}