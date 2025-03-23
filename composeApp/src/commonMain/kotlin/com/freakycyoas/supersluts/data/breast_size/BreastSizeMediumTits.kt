package com.freakycyoas.supersluts.data.breast_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.breast_size_MEDIUM_TITS

@Immutable
@Stable
object BreastSizeMediumTits: MainChoice by SimpleMainChoice(
    image = Res.drawable.breast_size_MEDIUM_TITS,
    name = "MEDIUM TITS",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.breast_size.BreastSizeErogenousNipples },
    text = AnnotatedString("Please don’t tell me you want to have boring medium-sized tits like most girls have. Do you want your action figures to sell or not?"),
    powerPoints = 0.pp,
)