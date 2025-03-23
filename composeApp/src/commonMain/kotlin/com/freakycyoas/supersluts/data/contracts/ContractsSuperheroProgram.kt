package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.powers.PowersProtection
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_SUPERHERO_PROGRAM

@Immutable
@Stable
object ContractsSuperheroProgram: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_SUPERHERO_PROGRAM,
    name = "SUPERHERO PROGRAM",
    text = AnnotatedString("You will basically get paid to breed with other superheroes in the Superhero Program. The purpose of this program is to create the next generation of superheroes. Females will need to give birth to at least 4 children per every 10 years and males will be expected to impregnate a minimum of 60 superheroes per year."),
    goldPoints = 20.gp,
    incompatibleWith = { listOf(PowersProtection, SponsorWaltDisney, SponsorBlissIndustries, SponsorSexySecret) }
)