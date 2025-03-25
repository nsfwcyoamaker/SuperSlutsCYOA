package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_POWERFUL_ORGASMS

@Immutable
@Stable
object PowersPowerfulOrgasms: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_POWERFUL_ORGASMS,
    name = "POWERFUL ORGASMS",
    text = AnnotatedString("Your orgasms will be next-level orgasms. Like when you cum, you will cum really fucking hard. We are talking about knee shattering orgasms here and they will also last for several minutes."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersPowerMode::class },
)