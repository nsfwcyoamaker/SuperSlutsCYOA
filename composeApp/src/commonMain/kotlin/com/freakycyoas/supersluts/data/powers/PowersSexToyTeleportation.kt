package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SEX_TOY_TELEPORTATION

@Immutable
@Stable
object PowersSexToyTeleportation: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SEX_TOY_TELEPORTATION,
    name = "SEX TOY TELEPORTATION",
    text = AnnotatedString("Whenever you teleport there is a small chance that 1 or multiple random sex toys will get teleported onto you. Teleporting again won’t remove them, they must be removed by hand."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersTeleportation::class },
    requires = { listOf(PowersTeleportation()) },
)