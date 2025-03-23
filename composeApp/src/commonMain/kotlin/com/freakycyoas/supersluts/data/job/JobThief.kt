package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseNoLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_THIEF

object JobThief: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_THIEF,
    name = "THIEF",
    text = AnnotatedString("As a superhero, it would be really easy to steal things. Did the bad guys steal a valuable necklace? Why not take the necklace as payment for tying up the villains for the police? You can expect a much harsher sentence if you are caught by the police or any superhero."),
    goldPoints = 11.gp,
    requires = { listOf(SuperheroLicenseNoLicense) }
)