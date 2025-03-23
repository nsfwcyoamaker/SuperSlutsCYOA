package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_SUPERMODEL

object JobSupermodel: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_SUPERMODEL,
    name = "SUPERMODEL",
    text = AnnotatedString("You will be a supermodel and not just any supermodel! An underwear model! What’s not to like about this job? Well, your manager will grope, fondle and demand sex from you behind the scenes. If you refuse, you will get fired immediately."),
    goldPoints = 11.gp,
    requires = { listOf(SponsorSexySecret) }
)