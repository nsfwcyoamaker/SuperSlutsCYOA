package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_four_eyes

@Immutable
@Stable
object HairColorFourEyes: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.hair_four_eyes,
    name = "FOUR EYES",
    text = AnnotatedString("You will get really bad eyesight. Like you will need to wear glasses to see anything. Your eyesight can never get better by magic, technology, etc. While wearing your superhero uniform you can uses lenses, but otherwise, lenses won't work."),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { HairColorBrown },
)