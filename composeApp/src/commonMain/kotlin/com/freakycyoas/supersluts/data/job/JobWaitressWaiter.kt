package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_WAITRESS_WAITER

object JobWaitressWaiter: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_WAITRESS_WAITER,
    name = "WAITRESS/WAITER",
    text = AnnotatedString("You’ll work as a waitress or waiter at a cafe. The pay isn’t very good, but you’ll earn lots of money from tips if you flirt with the customers."),
    goldPoints = 5.gp,
)