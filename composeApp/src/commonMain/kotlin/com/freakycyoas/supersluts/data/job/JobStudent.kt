package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_STUDENT

object JobStudent: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_STUDENT,
    name = "STUDENT",
    text = AnnotatedString("Being a student can be a lot of fun! You will make tons of new friends and you’ll have lots of free time. You can either go to a normal school or a school for superheroes."),
    goldPoints = 2.gp,
)