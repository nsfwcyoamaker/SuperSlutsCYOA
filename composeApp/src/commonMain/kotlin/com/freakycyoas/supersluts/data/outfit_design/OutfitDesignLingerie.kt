package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorNoSponsor
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_LINGERIE

@Immutable
@Stable
object OutfitDesignLingerie: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_LINGERIE,
    name = "LINGERIE",
    text = buildAnnotatedString {
        append("Perhaps being naked is a bit too bold and daring for you. What about a lingerie outfit? Think along the lines of lace bras, garter belts, corsets, lace dresses and stockings. If you got a ")
        withStyle(choiceSubtitleSpanStyle) { append("Sexy Secret") }
        append(" sponsorship you will gain ")
        withStyle(goldPointsStyle) { append("5 Gold Points") }
        append(" for choosing this option.")
    },
    requires = { listOf(SponsorSexySecret, SponsorXoxo, SponsorNoSponsor) },
    requiresAll = false,
) {
    @Stable
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints = if(allSelectedChoices.contains(SponsorSexySecret)) 5.gp else 0.gp
}