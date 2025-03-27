package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseNoLicense
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.GoldPoints
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_REFORMED_SUPERVILLAINS

private val cost = (-15).gp

//TODO reformed supervillains section

@Immutable
@Stable
object PerkReformedSupervillains: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_REFORMED_SUPERVILLAINS,
    name = "REFORMED SUPERVILLAINS",
    text = buildAnnotatedString {
        append("This option is free if you have the option: ")
        withStyle(choiceSubtitleSpanStyle) { append("No License") }
        append(". Sometimes supervillains have a change of heart and become vigilantes or heroes and sometimes they are offered a large amount of money which they cant resist. You could recruit such individuals and form a crime-fighting team. OSI are typically opposed to such arrangements, but for a steep fee, they will allow it. You may purchase supervillains and add them to your team. To recruit them you need to pay the amount of ")
        withStyle(goldPointsStyle) { append("Gold Points") }
        append(" they normally grant.")
    },
    goldPoints = cost
) {
    override fun grantedGoldPoints(allSelectedChoices: List<Choice>): GoldPoints {
        return if(allSelectedChoices.contains(SuperheroLicenseNoLicense)) 0.gp else cost
    }
}