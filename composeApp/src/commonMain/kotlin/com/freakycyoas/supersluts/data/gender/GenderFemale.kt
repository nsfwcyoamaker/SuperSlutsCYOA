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
import superslutscyoa.composeapp.generated.resources.gender_female

@Immutable
@Stable
object GenderFemale: MainChoice by SimpleMainChoice(
    image = Res.drawable.gender_female,
    name = "FEMALE",
    text = buildAnnotatedString {
        append("I don't do makeovers half-heartedly so I will not turn you into a girl, I will turn you into THE GIRL, your beauty will be divine. As a girl, you will inspire lust and desire in all who gaze upon you. Everyone will want you, yeah that means the supervillains, especially the supervillains. They will want to rape and ravage you. No, sorry, I won't settle for anything less than divine beauty! If this option caused you to change gender you gain ")
        withStyle(powerPointsStyle) { append("10") }
        append(" additional ")
        withStyle(powerPointsStyle) { append("Power Points") }
        append(".")
    },
    powerPoints = 20.pp,
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.gender.GenderGirly },
)