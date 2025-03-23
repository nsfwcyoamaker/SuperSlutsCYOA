package com.freakycyoas.supersluts.data.butt_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.MultipleSpanDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.butt_size_ANAL_HATER
import com.freakycyoas.supersluts.model.pp

@Immutable
@Stable
object ButtSizeAnalHater: DrawbackChoice by MultipleSpanDrawbackChoice(
    image = Res.drawable.butt_size_ANAL_HATER,
    name = "ANAL HATER",
    text = AnnotatedString("Your anus feels absolutely amazing to fuck. However, anal stimulation is outright painful for you. You won’t be able to enjoy anal sex unless you’re a huge masochist. Not only is the penetration painful, but the pain will linger, it will make you walk funny for a couple of days afterward."),
    givenPowerPoints = 10.pp,
    linkedMainChoices = { listOf(
        com.freakycyoas.supersluts.data.butt_size.ButtSizeTinyAss,
        com.freakycyoas.supersluts.data.butt_size.ButtSizeSmallAss
    ) },
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.butt_size.ButtSizeButtslut) },
)
