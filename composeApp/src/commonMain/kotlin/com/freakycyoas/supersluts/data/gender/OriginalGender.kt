package com.freakycyoas.supersluts.data.gender

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.*
import org.jetbrains.compose.resources.DrawableResource
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.placeholder

class OriginalGender(val originalGender: Gender): Choice {
    override val name: String
        get() = originalGender.name
    override val image: DrawableResource
        get() = Res.drawable.placeholder //todo remove somehow
    override val description: AnnotatedString
        get() = AnnotatedString("")

    override fun grantedPowerPoints(allSelectedChoices: List<Choice>): PowerPoints {
        val switchedToFemale = originalGender == Gender.MALE && allSelectedChoices.contains(
            GenderFemale
        )
        val switchedToMale = originalGender == Gender.FEMALE && allSelectedChoices.contains(
            GenderMale
        )

        return if(switchedToFemale || switchedToMale) { 10.pp } else { 0.pp }
    }

    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = 0.gp
    override fun grantedFatePoints(allSelectedChoices: List<Choice>): FatePoints = 0.fp
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean = true
}