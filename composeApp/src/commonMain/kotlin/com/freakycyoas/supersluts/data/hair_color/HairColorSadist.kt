package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_sadist

@Immutable
@Stable
object HairColorSadist: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.hair_sadist,
    name = "SADIST",
    text = AnnotatedString("You will become a huge sadist, nothing will turn you on more than seeing others suffer, especially supervillains and their goons. Making them scream and beg for mercy will feel like the best thing ever."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { HairColorBlack },
)
