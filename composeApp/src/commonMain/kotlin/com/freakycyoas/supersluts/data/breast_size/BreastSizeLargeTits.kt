package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_LARGE_TITS

@Immutable
@Stable
object BreastSizeLargeTits: MainChoice by SimpleMainChoice(
    image = Res.drawable.breast_size_LARGE_TITS,
    name = "LARGE TITS",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeFuckableNipples },
    text = AnnotatedString("You will have really big tits, but you could always go bigger you know. You shouldn’t half-ass tits, like either go super big or go flat."),
    powerPoints = 1.pp,
)