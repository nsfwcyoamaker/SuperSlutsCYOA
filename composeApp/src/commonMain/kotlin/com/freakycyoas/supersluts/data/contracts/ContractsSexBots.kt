package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_SEX_BOTS

@Immutable
@Stable
object ContractsSexBots: MainChoice by ContractChoice(
    image = Res.drawable.contracts_SEX_BOTS,
    name = "SEX BOTS",
    text = AnnotatedString("Your sponsor will sell sex robots of you. For just a couple of thousand dollars, anyone will be able to buy, fuck and own a robot version of you. The sexbots will look and sound identical to you so don’t be surprised if you see someone make out with one of your sexbots in public or if someone mistakes you for one."),
    goldPoints = 7.gp,
    requires = { listOf(SponsorSexySecret, SponsorXoxo) },
    requiresAll = false,
)