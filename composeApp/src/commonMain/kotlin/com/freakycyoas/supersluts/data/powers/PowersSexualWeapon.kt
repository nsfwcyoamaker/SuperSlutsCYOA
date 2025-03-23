package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SEXUAL_WEAPON

@Immutable
@Stable
object PowersSexualWeapon: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SEXUAL_WEAPON,
    name = "SEXUAL WEAPON",
    text = AnnotatedString("Your natural weapons must be ‘sexy”. For example, it could be a long prehensile tongue, tentacles, a vagina with razor-sharp teeth, a click that can shoot sticky goo or prehensile pubic hair."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { PowersNaturalWeapon::class },
    requires = { listOf(PowersNaturalWeapon()) },
)