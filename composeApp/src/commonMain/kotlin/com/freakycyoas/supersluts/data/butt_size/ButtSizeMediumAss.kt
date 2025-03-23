package com.freakycyoas.supersluts.data.butt_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.butt_size_MEDIUM_ASS
import com.freakycyoas.supersluts.model.pp

@Immutable
@Stable
object ButtSizeMediumAss: MainChoice by SimpleMainChoice(
    image = Res.drawable.butt_size_MEDIUM_ASS,
    name = "MEDIUM ASS",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.butt_size.ButtSizeSensitiveButt },
    text = AnnotatedString("A medium-sized ass is a lot more well defined than the previous option, but also a bit more boring if you ask me."),
    powerPoints = 0.pp,
)