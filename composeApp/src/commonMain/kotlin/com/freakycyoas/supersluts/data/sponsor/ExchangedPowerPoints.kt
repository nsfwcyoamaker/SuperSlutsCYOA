package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.placeholder

class ExchangedPowerPoints(val powerPoints: PowerPoints): Choice {
    override val name: String
        get() = ""
    override val image: DrawableResource
        get() = Res.drawable.placeholder //todo remove somehow
    override val description: AnnotatedString
        get() = AnnotatedString("")
    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = (-(powerPoints.amount)).pp
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = (powerPoints.amount / 2).gp
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean = true
}