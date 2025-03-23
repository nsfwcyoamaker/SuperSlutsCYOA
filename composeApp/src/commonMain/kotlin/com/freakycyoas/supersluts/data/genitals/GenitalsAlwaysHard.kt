package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_ALWAYS_HARD

@Immutable
@Stable
object GenitalsAlwaysHard: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.genitals_ALWAYS_HARD,
    name = "ALWAYS HARD",
    text = AnnotatedString("Your cock (and/or clitoris) is perpetually erect. Whenever you get horny your erection will turn into a throbbing erection."),
    givenPowerPoints = 9.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.genitals.GenitalsLargePenis },
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.genitals.GenitalsLimpDick) }
)