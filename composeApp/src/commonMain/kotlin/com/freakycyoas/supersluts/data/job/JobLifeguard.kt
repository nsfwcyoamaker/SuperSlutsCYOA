package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_LIFEGUARD

object JobLifeguard: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_LIFEGUARD,
    name = "LIFEGUARD",
    text = AnnotatedString("Being a lifeguard is a relatively easy job, just beware of the perverts. You will notice people will trip an awful lot around you and accidentally grab your assets or tear off your swimsuit. Some will even go so far as to fake drowning to make you perform CPR on them so they can tongue kiss you."),
    goldPoints = 6.gp,
)