package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_STREAMER

object JobStreamer: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_STREAMER,
    name = "STREAMER",
    text = AnnotatedString("As a streamer, you will play games and try to be entertaining. You don’t have to be good at the games you play or even be funny. All you really need to do is to dress and act like a slut. To be a streamer is to walk a fine line between being a professional gamer and a softcore porn star."),
    goldPoints = 9.gp,
    incompatibleWith = { listOf(SponsorWaltDisney) },
)