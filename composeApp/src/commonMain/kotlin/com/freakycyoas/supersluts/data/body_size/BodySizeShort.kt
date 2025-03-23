package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_SHORT

@Immutable
@Stable
object BodySizeShort: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_size_SHORT,
    name = "SHORT",
    linkedDrawbackChoice = { BodySizeSubmissive },
    text = AnnotatedString("How about being shorter than the average person of your gender? Bigger is not always better. Smaller is cuter you know!"),
    powerPoints = 1.pp,
)