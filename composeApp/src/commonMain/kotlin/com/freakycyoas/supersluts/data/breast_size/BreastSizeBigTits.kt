package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_BIG_TITS

@Immutable
@Stable
object BreastSizeBigTits: MainChoice by SimpleMainChoice(
    image = Res.drawable.breast_size_BIG_TITS,
    name = "BIG TITS",
    linkedDrawbackChoice = { BreastSizeLactation },
    text = AnnotatedString("Now we are talking, tits this big is really jiggly, bouncy and squishy, perfect for a superheroine!"),
    powerPoints = 2.pp,
)