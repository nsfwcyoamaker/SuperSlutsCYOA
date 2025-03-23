package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_STUCK

@Immutable
@Stable
object PowersStuck: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_STUCK,
    name = "STUCK",
    text = AnnotatedString("At random times your powers will stop working and you will harmlessly get stuck in walls and other objects for 30 minutes. This won’t happen very often, but when it happens you will be stuck in sexually inviting poses and there will always be at least 1 bystander."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersIntangibility::class },
    requires = { listOf(PowersIntangibility()) },
)