package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_BIG_PENIS

@Immutable
@Stable
object GenitalsBigPenis: MainChoice by SimpleMainChoice(
    image = Res.drawable.genitals_BIG_PENIS,
    name = "BIG PENIS",
    text = AnnotatedString("Or perhaps you want a bigger penis? Like really big! It will make a huge bulge in your pants and it will be next to impossible to hide, even while it’s flaccid. But that’s part of the charm, right?"),
    powerPoints = 3.pp,
    linkedDrawbackChoice = { GenitalsFuckablePeehole },
)


