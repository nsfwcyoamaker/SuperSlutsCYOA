package com.freakycyoas.supersluts.data.gender

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.gender_girly

@Immutable
@Stable
object GenderGirly: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.gender_girly,
    name = "GIRLY",
    text = AnnotatedString("Your subconscious mind will be altered to make your body language and the way you speak super feminine. You'll act like a stereotypical girl and you will also start to like girly things, like makeup and pretty dresses."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { com.freakycyoas.supersluts.data.gender.GenderFemale },
)