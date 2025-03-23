package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorNoSponsor
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_STRIPPER

object JobStripper: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_STRIPPER,
    name = "STRIPPER",
    text = AnnotatedString("With the looks I gave you, you would make an excellent stripper. Make sure you put on a good show and do your best to excite the crowd because being a stripper is a tip based job. Shake those money makers!"),
    goldPoints = 12.gp,
    requires = { listOf(SponsorSexySecret, SponsorXoxo, SponsorNoSponsor) },
    requiresAll = false,
)