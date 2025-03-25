package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_COMMERCIALS

@Immutable
@Stable
object ContractsCommercials: MainChoice by ContractChoice(
    image = Res.drawable.contracts_COMMERCIALS,
    name = "COMMERCIALS",
    text = AnnotatedString("Your sponsor will shamelessly use you in multiple commercials to promote anything from cheap energy drinks to products that are more specific to their cooperation. Selling out like this will cheapen your image in the eyes of the public."),
    goldPoints = 5.gp,
)