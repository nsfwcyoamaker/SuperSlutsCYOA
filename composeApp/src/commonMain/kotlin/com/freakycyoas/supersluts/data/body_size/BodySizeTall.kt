package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_TALL

@Immutable
@Stable
object BodySizeTall: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_size_TALL,
    name = "TALL",
    linkedDrawbackChoice = { com.freakycyoas.supersluts.data.body_size.BodySizeDominant },
    text = AnnotatedString("Would you like to be really tall? You could be tall like an amazonian warrior, you would stand head and shoulders above the tallest of men. Being this tall would make you a bit intimidating to approach."),
    powerPoints = 1.pp,
)