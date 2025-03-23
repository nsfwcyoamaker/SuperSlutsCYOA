package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_POWER_SLUT

@Immutable
@Stable
object PowersPowerSlut: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_POWER_SLUT,
    name = "POWER SLUT",
    text = AnnotatedString("Instead of having to touch people to absorb their powers, you need to have sex with them and make them cum. On the bright side, you will get to keep your absorbed powers 3 times as long."),
    givenPowerPoints = 15.pp,
    linkedMainChoice = { PowersAbsorbPower::class },
    requires = { listOf(PowersAbsorbPower()) },
)