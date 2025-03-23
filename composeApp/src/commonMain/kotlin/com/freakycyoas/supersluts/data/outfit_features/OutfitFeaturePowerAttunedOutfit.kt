package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.power_source.PowerSourceSymbionte
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_POWER_ATTUNED_OUTFIT

private val cost = (-5).gp

@Immutable
@Stable
object OutfitFeaturePowerAttunedOutfit: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_POWER_ATTUNED_OUTFIT,
    name = "POWER ATTUNED OUTFIT",
    text = buildAnnotatedString {
        append("Some powers are super impractical when it comes to clothes. For example, ")
        withStyle(choiceSubtitleSpanStyle) { append("Invisibility") }
        append(" won’t make your clothes invisible and ")
        withStyle(choiceSubtitleSpanStyle) { append("Intangibility") }
        append(" will make your clothes fall off. However, your outfit can be specifically designed to be attuned to your powers, so that your powers won’t cause a “wardrobe malfunction”. This option is free if you took ")
        withStyle(choiceSubtitleSpanStyle) { append("Symbiote") }
        append(".")
    },
    outfitGoldPoints = cost
) {
    @Stable
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        return if(allSelectedChoices.contains(PowerSourceSymbionte)) 0.gp else cost
    }
}