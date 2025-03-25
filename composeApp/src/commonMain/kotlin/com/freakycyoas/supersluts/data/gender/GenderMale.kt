package com.freakycyoas.supersluts.data.gender

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.powerPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.gender_male

@Immutable
@Stable
object GenderMale: MainChoice by SimpleMainChoice(
    image = Res.drawable.gender_male,
    name = "MALE",
    text = buildAnnotatedString {
        append("Yeah, and there is also the option to be a man... It's not like I don't like men but let's just say I enjoy their penises a lot more than I enjoy their looks. I'm also not very good at flesh sculpting males, I won't be able to make you as beautiful as if you chose to be a girl, but I'Il do my best. Which will probably make you the best looking man on the planet, but your looks won't be like divine or anything. If this option caused you to change gender you gain ")
        withStyle(powerPointsStyle) { append("10") }
        append(" additional ")
        withStyle(powerPointsStyle) { append("Power Points") }
        append(".")
    },
    powerPoints = 20.pp,
    linkedDrawbackChoice = { GenderChivalrous },
)


