package com.freakycyoas.supersluts.data.butt_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.data.genitals.GenitalsVagina
import com.freakycyoas.supersluts.model.DrawbackChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.butt_size_PUFFY_PUSSY
import com.freakycyoas.supersluts.model.pp

@Immutable
@Stable
object ButtSizePuffyPussy: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.butt_size_PUFFY_PUSSY,
    name = "PUFFY PUSSY",
    text = AnnotatedString("You will have a huge puffy pussy. Your cunt cushion will tightly wrap around any cock and make vaginal penetration more pleasurable. However, wearing yoga pants or anything remotely tight will always give you a huge camel toe."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.butt_size.ButtSizeSuperAss },
    requires = { listOf(GenitalsVagina) },
)
