package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_MAID_BUTLER

object JobMaidButler: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_MAID_BUTLER,
    name = "MAID/BUTLER",
    text = AnnotatedString("You’ll be the personal maid or butler for either a rich gentleman or a rich noblewoman. Your duties will mainly consist of attending and accompanying your employer. But you will also be expected to occasionally satisfy their sexual needs and keep quiet about it."),
    goldPoints = 10.gp,
)