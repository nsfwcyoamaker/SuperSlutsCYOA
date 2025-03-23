package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_WEAPON

@Stable
@Immutable
class OutfitFeatureWeapon(
    override val boughtTimes: Int = 0,
): MultibuyMainChoice,
    MainChoice by SimpleMainChoice(
        image = Res.drawable.outfit_features_WEAPON,
        name = "WEAPON",
        text = buildAnnotatedString {
            append("Do you know what makes great accessories? Weapons! So what kind of weapon do you want? A master-crafted magical hammer made from star metal or perhaps some kind of high tech prototype projectile weapon from Bliss Industries? You may purchase this option multiple times to gain multiple weapons. After the first purchase, the cost of this option is reduced by ")
            withStyle(goldPointsStyle) { append("7 Gold Points") }
            append(".")
        },
        goldPoints = (-10).gp
    ),
    PointsBearerItem {

    init {
        require(boughtTimes >= 0)
    }

    companion object {
        private val firstBuyCost = (-10).gp
        private val multiBuyCost = (-3).gp
    }

    override fun ofAmount(newAmount: Int): MultibuyMainChoice {
        return OutfitFeatureWeapon(newAmount.coerceAtLeast(0))
    }

    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean = true

    override fun getLinkedDrawbackChoice(): DrawbackChoice? = null

    @Stable
    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = 0.pp

    @Stable
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp

    @Stable
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        return when {
            boughtTimes == 1 -> {
                firstBuyCost
            }
            boughtTimes > 1 -> {
                firstBuyCost + (multiBuyCost * (boughtTimes - 1))
            }
            else -> 0.gp
        }
    }

    @Stable
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
}