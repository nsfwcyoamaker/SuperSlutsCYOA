package com.freakycyoas.supersluts.data.butt_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.butt_size_BUTTSLUT
import com.freakycyoas.supersluts.model.pp

@Immutable
@Stable
object ButtSizeButtslut: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.butt_size_BUTTSLUT,
    name = "BUTTSLUT",
    text = AnnotatedString("Getting penetrated in the ass will make you cum like crazy, once you have tried it you will become addicted to it. Abstaining from anal stimulation will decrease your thirst for butt sex."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.butt_size.ButtSizeBigAss },
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.butt_size.ButtSizeAnalHater) }
)
