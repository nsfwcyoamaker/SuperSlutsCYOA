package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_NYOTAIMORI_NANTAIMORI

object JobNyotaimoriNantaimori: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_NYOTAIMORI_NANTAIMORI,
    name = "NYOTAIMORI/NANTAIMORI",
    text = AnnotatedString("Your job is to be a living food plate. Sushi will be served on your naked body and you will be expected to lie still and be silent. The costumers are allowed to touch your body with their hands as much as they want."),
    goldPoints = 8.gp,
    incompatibleWith = { listOf(SponsorWaltDisney) },
)