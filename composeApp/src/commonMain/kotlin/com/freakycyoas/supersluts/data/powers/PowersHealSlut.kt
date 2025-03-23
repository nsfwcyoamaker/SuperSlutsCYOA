package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_HEAL_SLUT

@Immutable
@Stable
object PowersHealSlut: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_HEAL_SLUT,
    name = "HEAL SLUT",
    text = AnnotatedString("You gain an irresistible sexual attraction to anyone you have healed, the attraction will wear off after 5 hours. When you gaze at them you will be like a bitch in heat, you would do almost anything to fuck them short of raping them."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersHealing::class },
    requires = { listOf(PowersHealing()) }
)