package com.freakycyoas.supersluts.data.social_class

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.GoldPointsModifier
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.social_class_UPPER_CLASS
import kotlin.math.floor

@Immutable
@Stable
object SocialClassUpperClass: MainChoice by SimpleMainChoice(
    image = Res.drawable.social_class_UPPER_CLASS,
    name = "UPPER CLASS",
    text = buildAnnotatedString {
        append("Prepare yourself for a life of luxury! You’re going to be filthy rich! You’ll get your own mansion and I’ll decorate it with whatever items you want. Not that I need to, you could easily hire a team of professional designers to do it. You’ll frequently get invited to balls, galas and other fancy high society stuff. Because you’re rich, all options that cost ")
        withStyle(goldPointsStyle) { append ("Gold Points") }
        append(" cost ")
        withStyle(goldPointsStyle) { append ("50%") }
        append(" less ")
        withStyle(goldPointsStyle) { append ("Gold Points") }
        append(" rounded up (except ")
        withStyle(choiceSubtitleSpanStyle) { append("Upper Class") }
        append(").")
    },
    linkedDrawbackChoice = { SocialClassAnnoyingLaughter },
    goldPoints = (-70).gp,
), GoldPointsModifier {
    @Stable override val priority: Int = Int.MAX_VALUE

    @Stable override fun modifyGrantedGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceGoldPoints: GoldPoints): GoldPoints {
        if(choice is SocialClassUpperClass) return choiceGoldPoints

        return choiceGoldPoints.amount.let { amount ->
            if(amount < 0) {
                floor(amount.toDouble() / 2.0).toInt()
            } else {
                amount
            }
        }.gp
    }

    @Stable override fun modifyGrantedOutfitGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceOutfitGoldPoints: GoldPoints): GoldPoints {
        if(choice is SocialClassUpperClass) return choiceOutfitGoldPoints

        return choiceOutfitGoldPoints.amount.let { amount ->
            if(amount < 0) {
                floor(amount.toDouble() / 2.0).toInt()
            } else {
                amount
            }
        }.gp
    }
}