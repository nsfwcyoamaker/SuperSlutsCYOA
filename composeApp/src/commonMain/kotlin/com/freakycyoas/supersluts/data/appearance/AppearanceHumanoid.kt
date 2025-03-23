package com.freakycyoas.supersluts.data.appearance

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.appearance_humanoid

@Immutable
@Stable
object AppearanceHumanoid: MainChoice by SimpleMainChoice(
    image = Res.drawable.appearance_humanoid,
    name = "HUMANOID",
    text = AnnotatedString("What about some non-human features? You can choose any non-human features you want, but must choose at least 1 feature. Like squirrel ears and a tail, vampire fangs, elf ears, antennas or tentacle hair."),
    powerPoints = 3.pp,
    linkedDrawbackChoice = { AppearanceAnimalGenitals },
)