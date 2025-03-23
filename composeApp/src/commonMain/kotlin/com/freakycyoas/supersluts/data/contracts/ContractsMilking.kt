package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_MILKING

@Immutable
@Stable
object ContractsMilking: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_MILKING,
    name = "MILKING",
    text = AnnotatedString("A nurse with some milking equipment will come to visit you each day to extract sexual fluids from you, which will be up for sale. Tons of fans will buy your sexual fluids, some fans like to collect sexual fluids while others like to drink them. The more fanatical fans might even inseminate themselves with cum in the hopes of getting pregnant."),
    goldPoints = 10.gp,
    requires = { listOf(SponsorSexySecret, SponsorXoxo) },
    requiresAll = false,
)