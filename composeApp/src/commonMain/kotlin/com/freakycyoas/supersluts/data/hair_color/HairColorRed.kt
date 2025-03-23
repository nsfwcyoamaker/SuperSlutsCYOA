package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_red

@Immutable
@Stable
object HairColorRed: MainChoice by SimpleMainChoice(
    image = Res.drawable.hair_red,
    name = "RED",
    text = AnnotatedString("People tend to see redheads as unique, interesting, passionate, loving and sensual! On the other hand, they get a bad rap for being aggressive and promiscuous."),
    linkedDrawbackChoice = { HairColorSlut },
    powerPoints = 2.pp,
)



