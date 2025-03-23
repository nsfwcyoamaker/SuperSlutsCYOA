package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_MARTIAL_ARTS

@Immutable
@Stable
object PowerSourceMartialArts: MainChoice by SimpleMainChoice(
    image = Res.drawable.power_source_MARTIAL_ARTS,
    name = "MARTIAL ARTS",
    text = AnnotatedString("Even if your powers are supernatural, their totally natural. Like you’re just someone who trained martial arts to the point where your mastery over your own body rose to the level where you could dodge bullets, punch through metal, flex your muscles to become invulnerable and that kind of stuff. This power source will severely limit what powers you will be able to pick as there is a limit to what the human body can do even if that line is rather blurry."),
    linkedDrawbackChoice = { PowerSourceSexyStyle },
    powerPoints = 10.pp,
)