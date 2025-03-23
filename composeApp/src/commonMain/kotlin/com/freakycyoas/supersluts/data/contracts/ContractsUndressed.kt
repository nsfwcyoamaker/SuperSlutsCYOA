package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_UNDRESSED

@Immutable
@Stable
object ContractsUndressed: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_UNDRESSED,
    name = "UNDRESSED",
    text = AnnotatedString("Undressed is a softcore porn magazine that specializes in superheroes. You will be featured several times per year in their magazine. Prepare yourself for nude photoshoots and interviews involving truth serums. You will get asked questions like what is your favorite sex position and what is the kinkiest thing you have ever done."),
    goldPoints = 7.gp,
    requires = { listOf(SponsorSexySecret, SponsorXoxo) },
    requiresAll = false,
)