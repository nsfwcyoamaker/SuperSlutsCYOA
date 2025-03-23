package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_MEDIUM_PENIS

@Immutable
@Stable
object GenitalsMediumPenis: MainChoice by SimpleMainChoice(
    image = Res.drawable.genitals_MEDIUM_PENIS,
    name = "MEDIUM PENIS",
    text = AnnotatedString("Would you rather have a medium-sized penis? Come on don’t be boring, why would you want an average-sized penis?"),
    powerPoints = 0.pp,
    linkedDrawbackChoice = { GenitalsLimpDick },
)


