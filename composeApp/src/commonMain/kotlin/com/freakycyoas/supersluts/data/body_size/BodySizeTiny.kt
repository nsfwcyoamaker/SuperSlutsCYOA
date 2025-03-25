package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_TINY

@Immutable
@Stable
object BodySizeTiny: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_size_TINY,
    name = "TINY",
    linkedDrawbackChoice = { BodySizeSubmissive },
    text = AnnotatedString("It would be really adorable if you were super tiny like a fairy. It might be a bit hard to fight crime being the size of a doll, but it definitely would look cute as fuck!"),
    powerPoints = 10.pp,
)