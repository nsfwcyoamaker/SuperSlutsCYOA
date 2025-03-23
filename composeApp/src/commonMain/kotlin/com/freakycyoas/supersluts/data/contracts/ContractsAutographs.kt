package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_AUTOGRAPHS

@Immutable
@Stable
object ContractsAutographs: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_AUTOGRAPHS,
    name = "AUTOGRAPHS",
    text = AnnotatedString("Fans love to get autographs and you will be under contract to sign whatever your fans wants signed. It doesn’t matter if it’s a used dildo, their penis or a pair of tits, you will write your name on it! You better start practicing on your handwriting, because you will be writing a lot of autographs."),
    goldPoints = 5.gp,
    incompatibleWith = { listOf(SponsorWaltDisney) }
)