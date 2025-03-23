package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_COMMANDO

@Immutable
@Stable
object PowersCommando: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_COMMANDO,
    name = "COMMANDO",
    text = AnnotatedString("You can’t use your superpowers unless you wear no underwear and some kind of skirt, kilt, dress, robe or nothing at all. The skirt-like clothing must not reach past your knees or it will count as pants."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { PowersFlight::class },
)