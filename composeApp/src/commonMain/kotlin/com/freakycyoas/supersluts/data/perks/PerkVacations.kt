package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseNoLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_VACATIONS

@Immutable
@Stable
object PerkVacations: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_VACATIONS,
    name = "VACATIONS",
    text = AnnotatedString("Normally licensed superheroes and sidekicks don't get vacations. If you want to be able to take vacations you will have to pay OSI a vacation fee. Paying this fee will give you 2 months of vacation per year and OSI will pay all the expenses of your vacations. You also get to bring all of your team members with you. Which will ensure a super happy fun time!"),
    incompatibleWith = { listOf(SuperheroLicenseNoLicense) },
    goldPoints = (-5).gp
)