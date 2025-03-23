package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.powerPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_PENIS_VAGINA

@Immutable
@Stable
object GenitalsPenisVagina: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.genitals_PENIS_VAGINA,
    name = "PENIS VAGINA",
    text = buildAnnotatedString {
        append("Why choose between having a vagina or a penis when you can have both? Choose another option in this section, yes you will gain ")
        withStyle(powerPointsStyle) { append("Power Points") }
        append(" from the penis option you choose.")
    },
    givenPowerPoints = (-3).pp,
    linkedMainChoice = { GenitalsVagina },
    requires = { listOf(GenitalsVagina) }
)