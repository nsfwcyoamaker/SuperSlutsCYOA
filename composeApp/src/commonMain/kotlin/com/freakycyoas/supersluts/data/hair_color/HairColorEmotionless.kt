package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_emotionless

@Immutable
@Stable
object HairColorEmotionless: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.hair_emotionless,
    name = "EMOTIONLESS",
    text = AnnotatedString("You will become unable to express emotions with your face and your voice. You’ll have the best poker face in the world and you will always speak in a flat monotone voice."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { HairColorWhite },
)