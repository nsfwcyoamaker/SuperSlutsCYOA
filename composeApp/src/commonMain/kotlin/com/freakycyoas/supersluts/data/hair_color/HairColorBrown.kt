package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_brown

@Immutable
@Stable
object HairColorBrown: MainChoice by SimpleMainChoice(
    image = Res.drawable.hair_brown,
    name = "BROWN",
    text = AnnotatedString("Brunettes have a reputation for being sophisticated, intelligent and mature. But they are also viewd as boring and plain compared to their blonde, red, white and raven-haired counterparts."),
    linkedDrawbackChoice = { HairColorFourEyes },
    powerPoints = 0.pp,
)