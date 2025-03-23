package com.freakycyoas.supersluts.data.appearance

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.appearance_human

@Immutable
@Stable
object AppearanceHuman: MainChoice by SimpleMainChoice(
    image = Res.drawable.appearance_human,
    name = "HUMAN",
    text = AnnotatedString("Seriously? Do you want to be a boring human? What's the point in being a superhero if you're just going to look like everyone else. Stop being lame!"),
    powerPoints = 0.pp,
    linkedDrawbackChoice = { AppearanceUnnaturalSkinColor },
)