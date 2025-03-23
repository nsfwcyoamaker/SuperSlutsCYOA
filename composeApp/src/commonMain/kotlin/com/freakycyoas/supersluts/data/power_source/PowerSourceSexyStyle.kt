package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_SEXY_STYLE

@Immutable
@Stable
object PowerSourceSexyStyle: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.power_source_SEXY_STYLE,
    name = "SEXY STYLE",
    text = AnnotatedString("There is something overtly sexual about your fighting style. Maybe you’re a master of chocking your enemies with your thighs and crotch, your fighting style utilizes a lot of aerial butt bump attacks or perhaps your fighting style relies on an unusual amount of kicks to the groin? No matter what sexual aspect it takes, seeing you fight will be really hot. Don’t be surprised if a fan asks you to perform one of your signature moves on them while their friend takes a picture."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { PowerSourceMartialArts },
)