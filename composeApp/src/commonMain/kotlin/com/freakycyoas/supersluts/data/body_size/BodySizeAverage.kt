package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_AVERAGE

@Immutable
@Stable
object BodySizeAverage: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_size_AVERAGE,
    name = "AVERAGE",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.body_size.BodySizeSwitch },
    text = AnnotatedString("Really? You want to be average-sized for your gender? That’s soooo boring! But I guess it would be easier to keep your identity hidden if you didn’t have some crazy height that made you stand out."),
    powerPoints = 0.pp,
)