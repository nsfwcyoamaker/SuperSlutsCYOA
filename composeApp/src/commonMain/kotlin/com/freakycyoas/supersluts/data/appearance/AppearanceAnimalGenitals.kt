package com.freakycyoas.supersluts.data.appearance

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.appearance_animal_genitals

@Immutable
@Stable
object AppearanceAnimalGenitals: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.appearance_animal_genitals,
    name = "ANIMAL GENITALS",
    text = AnnotatedString("Instead of having a human cock, you will have the penis of an animal. You may choose the animal, but highly recommend that you go with a horse cock or a horse pussy!"),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { AppearanceHumanoid },
)

