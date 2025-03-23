package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_blonde

@Immutable
@Stable
object HairColorBlonde: MainChoice by SimpleMainChoice(
    image = Res.drawable.hair_blonde,
    name = "BLONDE",
    text = AnnotatedString("Blondes are often thought of as party girls. Seen as happy, cheerful, fun and social. However, they are also seen as vain, dumb and promiscuous compared to other hair colors. Totally undeserved if you ask me!"),
    linkedDrawbackChoice = { HairColorAirhead },
    powerPoints = 2.pp,
)


