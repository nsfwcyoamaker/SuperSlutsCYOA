package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorNoSponsor
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_TEST_SUBJECT

object JobTestSubject: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_TEST_SUBJECT,
    name = "TEST SUBJECT",
    text = AnnotatedString("You will be used as a human lab rat. The experiments will always be sexual in nature. It can be anything from testing an experimental aphrodisiac to being observed by a bunch of scientists while a tentacle monster mates with you. Who could have known science could be so fun?"),
    goldPoints = 14.gp,
    requires = { listOf(SponsorDawnGenetics, SponsorXoxo, SponsorNoSponsor) },
    requiresAll = false,
)