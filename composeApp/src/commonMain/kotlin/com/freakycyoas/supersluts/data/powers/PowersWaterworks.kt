package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_WATERWORKS

@Immutable
@Stable
object PowersWaterworks: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_WATERWORKS,
    name = "WATERWORKS",
    text = AnnotatedString("Whenever you experience sexual pleasure your mouth will begin to salivate and your eyes will tear up. You will begin to drool and tears will flow down your cheeks. The greater the pleasure the greater the effect."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { PowersAmphibic::class }
)