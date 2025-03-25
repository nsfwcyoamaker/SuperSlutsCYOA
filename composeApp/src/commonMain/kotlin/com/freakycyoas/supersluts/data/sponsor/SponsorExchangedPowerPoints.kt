package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.placeholder

class SponsorExchangedPowerPoints(val amount: Int): Choice {
    override val name: String
        get() = ""
    override val image: DrawableResource
        get() = Res.drawable.placeholder //todo remove somehow
    override val description: AnnotatedString
        get() = AnnotatedString("")

    fun consumedPoints() = (amount * 2).pp
    fun gainedPoints() = (amount).gp

    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints = (-(amount * 2)).pp
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = amount.gp
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean = true
}