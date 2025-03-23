package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.identity.IdentityKnownIdentity
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_FULL_TIME_SUPERHERO

object JobFullTimeSuperhero: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_FULL_TIME_SUPERHERO,
    name = "FULL-TIME SUPERHERO",
    text = AnnotatedString("So you wanna be a full-time superhero? That’s very admirable of you!"),
    goldPoints = 5.gp,
    requires = { listOf(IdentityKnownIdentity) },
)