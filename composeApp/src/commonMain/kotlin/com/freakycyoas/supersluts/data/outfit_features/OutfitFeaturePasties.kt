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
import superslutscyoa.composeapp.generated.resources.outfit_features_PASTIES

@Immutable
@Stable
object OutfitFeaturePasties: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_features_PASTIES,
    name = "PASTIES",
    text = buildAnnotatedString {
        append("If you want to be a bit daring but not too daring. We could cover up your naughty bits with pasties. If your sponsor is ")
        withStyle(choiceSubtitleSpanStyle) { append("Sexy Secret") }
        append(" you may take ")
        withStyle(choiceSubtitleSpanStyle) { append("Open Top") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("Crotch Window") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("Open Bottom") }
        append(" and ")
        withStyle(choiceSubtitleSpanStyle) {  append(" Anus Window ") }
        append(" if you purchase this option.")
    },
    outfitGoldPoints = (-2).gp
)