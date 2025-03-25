package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_PR_MANAGER

//TODO requirement ignoring

@Immutable
@Stable
object PerkPrManager: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_PR_MANAGER,
    name = "PR MANAGER",
    text = buildAnnotatedString {
        append("Hiring a PR manager will vastly improve your public image and make sure you will be much more popular as a superhero. Even if your superhero outfit is the sluttiest outfit ever seen, your PR manager can make up a tragic backstory or some other lie why you are dressed the way you are and the public will eat it up word for word. You may ignore 1 requirement of 1 option on ")
        withStyle(choiceSubtitleSpanStyle) { append("SPONSOR") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("CONTRACTS") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("SOCIAL CLASS") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("SUPERHERO LICENSE") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("OUTFIT DESIGN") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("OUTFIT FEATURES") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("IDENTITY") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("PART-TIME JOB") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("BASE") }
        append(" or ")
        withStyle(choiceSubtitleSpanStyle) { append("PERKS") }
        append(" section.")
    },
    goldPoints = (-7).gp
)