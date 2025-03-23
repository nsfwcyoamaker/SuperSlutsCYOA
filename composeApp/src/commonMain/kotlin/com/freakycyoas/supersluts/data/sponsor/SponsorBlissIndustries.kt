package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.GoldPointsModifier
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.outfit_features.OutfitFeaturesChoicesGroup
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.sponsor_BLISS_INDUSTRIES

object SponsorBlissIndustries: MainChoice by SimpleMainChoice(
    image = Res.drawable.sponsor_BLISS_INDUSTRIES,
    name = "BLISS INDUSTRIES",
    text = buildAnnotatedString {
        append("Bliss Industries is a multinational corporate entity, or megacorporation. They are highly interested in recruiting some exceptional individuals to boost their public relations. With only the best products and development, but there are rumors that Bliss Industries is less than virtuous. If you choose ")
        withStyle(choiceSubtitleSpanStyle) { append("Bliss Industries") }
        append(" as your sponsor all options in the Outfit Features section that costs ")
        withStyle(goldPointsStyle) { append("Gold Points") }
        append(" will cost ")
        withStyle(goldPointsStyle) { append("3 Gold Points") }
        append(" less, to a minimum of ")
        withStyle(goldPointsStyle) { append("1 Gold Point") }
        append(".")
    },
    goldPoints = 15.gp
), GoldPointsModifier {
    override val priority: Int = 0

    override fun modifyGrantedGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceGoldPoints: GoldPoints): GoldPoints = choiceGoldPoints

    override fun modifyGrantedOutfitGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceOutfitGoldPoints: GoldPoints): GoldPoints {
        if(OutfitFeaturesChoicesGroup.choices.none { it::class == choice::class }) return choiceOutfitGoldPoints
        return choiceOutfitGoldPoints.amount.let { amount ->
            if(amount < 0) {
                (amount + 3).coerceAtMost(-1)
            } else {
                amount
            }
        }.gp
    }
}