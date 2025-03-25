package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_PUBLIC_WHORE

@Immutable
@Stable
object ContractsPublicWhore: MainChoice by ContractChoice(
    image = Res.drawable.contracts_PUBLIC_WHORE,
    name = "PUBLIC WHORE",
    text = AnnotatedString("Being on patrol is an important part of being a superhero. While on patrol superheroes will walk the streets and instill safety and security with their presence. However, when you are on patrol your job will be different, you will be a public whore and relieve people of their stress by having sex with them. Anyone will be able to walk up to you and fuck you as much as they want while you are on patrol."),
    goldPoints = 20.gp,
    requires = { listOf(SponsorXoxo) }
)