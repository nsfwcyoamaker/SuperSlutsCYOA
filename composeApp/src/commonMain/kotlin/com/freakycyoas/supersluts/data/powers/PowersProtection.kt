package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_PROTECTION

@Immutable
@Stable
object PowersProtection: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_PROTECTION,
    name = "PROTECTION",
    text = AnnotatedString("There is some mystical force that prevents you from impregnating others and getting impregnated yourself. No matter how much you try, impregnation is impossible for you. You will never have children."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { PowersForcefieldGeneration::class },
    incompatibleWith = { listOf(PowersBullseye) }
)