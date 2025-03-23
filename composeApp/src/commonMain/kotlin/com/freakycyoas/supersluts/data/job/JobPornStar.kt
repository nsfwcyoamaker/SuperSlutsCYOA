package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorNoSponsor
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_PORN_STAR

object JobPornStar: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_PORN_STAR,
    name = "PORN STAR",
    text = AnnotatedString("You’ll be a porn star! You can work in whatever porn genre you want, anything from lesbian porn to bondage porn, but no softcore shit like stripping. Your face will be everywhere on porn sites and you'll become quite famous for a porn star. Be prepared to get recognized on the streets."),
    goldPoints = 13.gp,
    requires = { listOf(SponsorXoxo, SponsorNoSponsor) },
    requiresAll = false,
)