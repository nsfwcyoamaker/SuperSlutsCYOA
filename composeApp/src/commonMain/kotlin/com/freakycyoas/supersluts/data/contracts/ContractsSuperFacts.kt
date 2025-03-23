package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_SUPER_FACTS

@Immutable
@Stable
object ContractsSuperFacts: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_SUPER_FACTS,
    name = "SUPER FACTS",
    text = AnnotatedString("Nerds love facts and that is a fact! Each year you must attend the Super Facts event. A kind of event that tests the bodies of Superheroes in different ways and records obscure sexual facts about them. For example, how many times can you orgasm consecutively before you lose consciousness? All of which is done in front of a live audience consisting of hardcore superhero fans."),
    goldPoints = 7.gp,
    requires = { listOf(SponsorXoxo) },
)