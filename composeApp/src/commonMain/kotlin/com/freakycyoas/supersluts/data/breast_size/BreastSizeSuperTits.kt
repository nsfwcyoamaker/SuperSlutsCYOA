package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_SUPER_TITS

@Immutable
@Stable
object BreastSizeSuperTits: MainChoice by SimpleMainChoice(
    image = Res.drawable.breast_size_SUPER_TITS,
    name = "SUPER TITS",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeInvertedNipples },
    text = AnnotatedString("You’ll have the breastest breasts! Your bountiful chest is guaranteed to give you lots of news coverage and adoring fans!"),
    powerPoints = 8.pp,
)