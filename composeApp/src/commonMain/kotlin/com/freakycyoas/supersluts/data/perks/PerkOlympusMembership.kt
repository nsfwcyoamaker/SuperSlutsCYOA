package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseNoLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_OLYMPUS_MEMBERSHIP

@Immutable
@Stable
object PerkOlympusMembership: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_OLYMPUS_MEMBERSHIP,
    name = "OLYMPUS MEMBERSHIP",
    text = AnnotatedString("Olympus is the official bar of OSI and acts as a social hub for superheroes. Only members are allowed in and only licensed superheroes can buy a membership. Food and drink are free for members. The location of the bar is secret, to get there members have to go to one of the many \"entrances\", secure locations with a gate machine that can open a stable wormhole to Olympus. The machine requires several DNA identification scans to be operated."),
    incompatibleWith = { listOf(SuperheroLicenseNoLicense) },
    goldPoints = (-6).gp
)
