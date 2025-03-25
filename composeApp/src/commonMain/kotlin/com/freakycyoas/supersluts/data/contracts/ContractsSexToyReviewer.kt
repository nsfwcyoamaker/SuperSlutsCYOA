package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_SEX_TOY_REVIEWER

@Immutable
@Stable
object ContractsSexToyReviewer: MainChoice by ContractChoice(
    image = Res.drawable.contracts_SEX_TOY_REVIEWER,
    name = "SEX TOY REVIEWER",
    text = AnnotatedString("Since this world is more technologically advanced than your old world there are all kinds of different sex toys out there to play with. Most people are interested in sex toys that their favorite superheroes endorse. Each month you will visit a sex toy manufacturer and test some of their wares. You will be interviewed while testing the sex toys. They will ask multiple questions about the toys and ask you to rate them."),
    goldPoints = 10.gp,
    requires = { listOf(SponsorSexySecret, SponsorXoxo) },
    requiresAll = false,
)