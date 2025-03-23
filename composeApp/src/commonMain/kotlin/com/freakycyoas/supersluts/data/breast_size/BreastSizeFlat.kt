package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_FLAT

@Immutable
@Stable
object BreastSizeFlat: MainChoice by SimpleMainChoice(
    image = Res.drawable.breast_size_FLAT,
    name = "FLAT",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeBreastEnvy },
    text = AnnotatedString("Do you want to be flat as a little girl? Being flat-chested looks best when you’re either male or have a young or petite body."),
    powerPoints = 2.pp,
)