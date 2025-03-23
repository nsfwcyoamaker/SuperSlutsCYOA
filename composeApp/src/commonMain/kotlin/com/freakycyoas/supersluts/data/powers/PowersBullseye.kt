package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_BULLSEYE

@Immutable
@Stable
object PowersBullseye: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_BULLSEYE,
    name = "BULLSEYE",
    text = AnnotatedString("Whenever you have sex impregnation is guaranteed. Literally nothing can prevent this. Condoms will break and chemical contraceptives simply won’t work."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersWeaponMastery::class },
    incompatibleWith = { listOf(PowersProtection) }
)