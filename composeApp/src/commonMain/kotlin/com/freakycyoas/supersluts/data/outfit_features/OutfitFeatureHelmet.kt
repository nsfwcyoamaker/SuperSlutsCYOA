package com.freakycyoas.supersluts.data.outfit_features

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_features_HELMET

@Stable
@Immutable
object OutfitFeatureHelmet: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_HELMET,
    name = "HELMET",
    text = buildAnnotatedString {
        append("You will get a psychic proof helmet as part of your outfit. When worn, it will protect you from telepathy, mind control, illusions and similar mind— based superpowers. Your helmet can be combined with a ")
        withStyle(choiceSubtitleSpanStyle) { append("Mask") }
        append(" and/or ")
        withStyle(choiceSubtitleSpanStyle) { append("Vision Device") }
        append(". Alternatively, your helmet could be a circlet.")
    },
    outfitGoldPoints = (-10).gp
)