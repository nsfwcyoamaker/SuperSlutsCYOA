package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_REMOTE_CONTROLLED_PLUGS

@Immutable
@Stable
object ContractsRemoteControlledPlugs: MainChoice by ContractChoice(
    image = Res.drawable.contracts_REMOTE_CONTROLLED_PLUGS,
    name = "REMOTE CONTROLLED PLUGS",
    text = buildAnnotatedString {
        append("Your superhero outfit must include some kind of plug that you will choose in the Outfit Feature section (")
        withStyle(choiceSubtitleSpanStyle) { append("Nipple Plugs") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("Urethral Plug") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("Pussy Plug") }
        append(", ")
        withStyle(choiceSubtitleSpanStyle) { append("Butt Plug") }
        append(".) Your sponsor will sell remote controls that can turn your plugs on and off to make them vibrate. The remote controls can adjust the vibrations to varying degrees, from “slight nuisance mode” to “orgasm cascade mode”. However the remote controls only have a range of 40 meters.")
    },
    goldPoints = 20.gp,
    requires = { listOf(SponsorXoxo) },
) {
    //TODO Requirement: Must purchase 1 or more plugs.
}