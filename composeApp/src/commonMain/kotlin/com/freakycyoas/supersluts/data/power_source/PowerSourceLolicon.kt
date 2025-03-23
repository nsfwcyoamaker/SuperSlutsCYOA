package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_LOLICON

@Immutable
@Stable
object PowerSourceLolicon: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.power_source_LOLICON,
    name = "LOLICON",
    text = AnnotatedString("You become a lolicon, you will lose all sexual attraction towards adult bodies. Kissing an adult will be totally disgusting to you, comparable to a heterosexual man forced to kiss another man. You only feel sexual attraction towards lolis and/or shotas. This holy and honorable fetish is popular among many holy men and rightfully so! Walking the path of the lolicon is a divine privilege reserved for only the holiest of saints. The unenlightened will hate and despise you if they find out that you are one of the blessed few who possesses this honorable fetish, but you must not hate them for their sinful ignorance."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowerSourceDivine },
)
