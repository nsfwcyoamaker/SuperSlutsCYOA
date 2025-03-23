package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_SMALL_TITS

@Immutable
@Stable
object BreastSizeSmallTits: MainChoice by SimpleMainChoice(
    image = Res.drawable.breast_size_SMALL_TITS,
    name = "SMALL TITS",
    linkedDrawbackChoice = { BreastSizeBreastEnvy },
    text = AnnotatedString("I can give you small and cutesy tits! How about that? You’ll have the cutest tits around!"),
    powerPoints = 1.pp,
)