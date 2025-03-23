package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.contracts.ContractsOrgasmReward
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_CHASTITY_DEVICE

private val cost = (-3).gp

@Immutable
@Stable
object OutfitFeatureChastityDevice: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_CHASTITY_DEVICE,
    name = "CHASTITY DEVICE",
    text = buildAnnotatedString {
        append("Don’t want to get raped? Then how about adding a chastity device to your outfit? This chastity device will be indestructible and cannot be removed, without the keys. It might not look high tech but it’s really high tech. Whatever you do make sure you don’t displace your keys, getting new keys might take a couple of weeks. You gain this option for free if you took ")
        withStyle(choiceSubtitleSpanStyle) { append("Orgasm Reward.") }
    },
    outfitGoldPoints = cost
) {
    @Stable
    override fun grantedOutfitGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        return if(allSelectedChoices.contains(com.freakycyoas.supersluts.data.contracts.ContractsOrgasmReward)) 0.gp else cost
    }
}