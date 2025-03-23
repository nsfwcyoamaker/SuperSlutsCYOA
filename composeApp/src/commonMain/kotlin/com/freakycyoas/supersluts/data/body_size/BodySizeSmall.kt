package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_SMALL

@Immutable
@Stable
object BodySizeSmall: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_size_SMALL,
    name = "SMALL",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.body_size.BodySizeSubmissive },
    text = AnnotatedString("Perhaps you want to be a bit taller? How about the size of a small child? It would make you really approachable, but some might not take you seriously because of your height... or lack of it."),
    powerPoints = 3.pp,
)