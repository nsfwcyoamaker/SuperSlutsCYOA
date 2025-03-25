package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_LIMP_DICK

@Immutable
@Stable
object GenitalsLimpDick: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.genitals_LIMP_DICK,
    name = "LIMP DICK",
    text = AnnotatedString("Your dick is completely limp, it cannot get erect. Beyond that, your penis works perfectly fine."),
    givenPowerPoints = 20.pp,
    linkedMainChoice = { GenitalsMediumPenis },
    incompatibleWith = { listOf(GenitalsVagina, GenitalsAlwaysHard) }
)