package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_MASOCHIST

@Immutable
@Stable
object PowersMasochist: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_MASOCHIST,
    name = "MASOCHIST",
    text = AnnotatedString("You will become a huge pain slut. Nothing will get you hornier than feeling pain. The stronger the pain the more excited you will become. Try not to go get hit too many times in a battle or you might end up wanting your enemies to hit you."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersRegeneration::class },
)