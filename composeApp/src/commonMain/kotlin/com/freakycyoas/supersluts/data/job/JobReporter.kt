package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_REPORTER

object JobReporter: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_REPORTER,
    name = "REPORTER",
    text = AnnotatedString("As a reporter, you will notice that many doors will open for you and you’ll get invaluable information that you can use as a superhero."),
    goldPoints = 4.gp,
)