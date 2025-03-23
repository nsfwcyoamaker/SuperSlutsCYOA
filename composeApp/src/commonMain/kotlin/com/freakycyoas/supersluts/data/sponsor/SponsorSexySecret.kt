package com.freakycyoas.supersluts.data.sponsor

import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.GoldPointsModifier
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.gender.GenderFemale
import com.freakycyoas.supersluts.data.outfit_features.OutfitFeaturesChoicesGroup
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.sponsor_SEXY_SECRET

object SponsorSexySecret: MainChoice by SimpleMainChoice(
    image = Res.drawable.sponsor_SEXY_SECRET,
    name = "SEXY SECRET",
    text = buildAnnotatedString {
        append("Sexy Secret is a designer, manufacturer and marketer of women's lingerie, womenswear and beauty products. Sexy Secret will only sponsor the most beautiful superheroes, as anything else would tarnish their brand. While they are okay with adult themes, they want glamorous divas, not whores in capes. Every option in the Outfit Features section that grants Gold Points will grant you ")
        withStyle(goldPointsStyle) { append("1 additional Gold Point") }
        append(".")
    },
    goldPoints = 10.gp,
    requires = { listOf(com.freakycyoas.supersluts.data.gender.GenderFemale) }
), GoldPointsModifier {
    override val priority: Int = 0

    override fun modifyGrantedGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceGoldPoints: GoldPoints): GoldPoints {
        if(choice !in OutfitFeaturesChoicesGroup.choices) return choiceGoldPoints
        return choiceGoldPoints.amount.let { amount ->
            if(amount > 0) {
                amount + 1
            } else {
                amount
            }
        }.gp
    }

    override fun modifyGrantedOutfitGoldPoints(allSelectedChoices: List<Choice>, choice: Choice, choiceOutfitGoldPoints: GoldPoints): GoldPoints = choiceOutfitGoldPoints
}