package com.freakycyoas.supersluts.data.butt_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.butt_size_SENSITIVE_BUTT
import com.freakycyoas.supersluts.model.pp

@Immutable
@Stable
object ButtSizeSensitiveButt: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.butt_size_SENSITIVE_BUTT,
    name = "SENSITIVE BUTT",
    text = AnnotatedString("Your butt is very sensitive, spanking will feel much more intense. When spanked, your bodily orifices will temporarily become tighter and spanking marks will also last much much longer."),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { ButtSizeMediumAss },
)
