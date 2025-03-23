package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_PREMATURE_EJACULATION

@Immutable
@Stable
object GenitalsPrematureEjaculation: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.genitals_PREMATURE_EJACULATION,
    name = "PREMATURE EJACULATION",
    text = AnnotatedString("When you get sexually excited you have a tendency to blow your load, so to speak. Often before you even put it in, talk about embarrassing!"),
    givenPowerPoints = 20.pp,
    linkedMainChoice = { GenitalsSmallPenis },
    incompatibleWith = { listOf(GenitalsVagina) }
)