package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_TEACHER

object JobTeacher: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_TEACHER,
    name = "TEACHER",
    text = AnnotatedString("Too old to be a student? You could always be a teacher! It’s a bit more work, but can be equally fun! Do you wanna be a normal reacher or a teacher at a school for superheroes?"),
    goldPoints = 3.gp,
)