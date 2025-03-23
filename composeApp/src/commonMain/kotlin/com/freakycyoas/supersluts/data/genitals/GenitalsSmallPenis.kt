package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_SMALL_PENIS

@Immutable
@Stable
object GenitalsSmallPenis: MainChoice by SimpleMainChoice(
    image = Res.drawable.genitals_SMALL_PENIS,
    name = "SMALL PENIS",
    text = AnnotatedString("Ever wanted to have an adorably small and effeminate penis? It can be anything from a micropenis to a small-sized penis."),
    powerPoints = 10.pp,
    linkedDrawbackChoice = { GenitalsPrematureEjaculation },
)


