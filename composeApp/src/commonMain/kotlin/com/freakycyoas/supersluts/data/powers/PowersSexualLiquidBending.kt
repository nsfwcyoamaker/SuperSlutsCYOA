package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SEXUAL_LIQUID_BENDING

@Immutable
@Stable
object PowersSexualLiquidBending: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SEXUAL_LIQUID_BENDING,
    name = "SEXUAL LIQUID BENDING",
    text = AnnotatedString("You don’t get to choose your element, instead you gain mastery over all sexual fluids. You will now be able to manipulate breast milk, cum, pussy juice, saliva and pee since some people find that to be a sexual fluid."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersElementManipulation::class },
    requires = { listOf(PowersElementManipulation()) },
)