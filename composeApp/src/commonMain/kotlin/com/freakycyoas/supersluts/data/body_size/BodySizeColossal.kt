package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_COLOSSAL

@Immutable
@Stable
object BodySizeColossal: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_size_COLOSSAL,
    name = "COLOSSAL",
    linkedDrawbackChoice = { BodySizeDominant },
    text = AnnotatedString("I have this crazy idea, how about I make you big as a giant? That’s like twice the size of a human. You would tower over your fellow men. I think it’s really fitting for a superhero since they should be larger than life."),
    powerPoints = 8.pp,
)