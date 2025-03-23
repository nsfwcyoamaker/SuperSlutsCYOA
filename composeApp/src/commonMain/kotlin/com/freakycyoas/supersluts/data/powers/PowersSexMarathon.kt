package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SEX_MARATHON

@Immutable
@Stable
object PowersSexMarathon: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SEX_MARATHON,
    name = "SEX MARATHON",
    text = AnnotatedString("During sex and masturbation, if you didn’t orgasm at least 20 times you will be left feeling horny, unsatisfied and sexually frustrated for a couple of hours."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersSuperhumanSpeed::class }
)