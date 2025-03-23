package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_WEAKNESS

@Immutable
@Stable
object PowerSourceWeakness: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.power_source_WEAKNESS,
    name = "WEAKNESS",
    text = AnnotatedString("Choose a rare material like kryptonite, an extremely valuable meteorite metal, magical items or something similar. Whenever you are in close proximity to your chosen material, you will become unable to use your powers, you’ll pretty much be a regular human. You should do your best to prevent your weakness from becoming public knowledge or your enemies will exploit it."),
    givenPowerPoints = 25.pp,
    linkedMainChoice = { PowerSourceGenetics },
)