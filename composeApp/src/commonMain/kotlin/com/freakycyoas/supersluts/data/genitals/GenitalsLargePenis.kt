package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_LARGE_PENIS

@Immutable
@Stable
object GenitalsLargePenis: MainChoice by SimpleMainChoice(
    image = Res.drawable.genitals_LARGE_PENIS,
    name = "LARGE PENIS",
    text = AnnotatedString("How about a large penis? Like above average-sized, it will be really big, but it won’t be freak show big. Most women will be really impressed with your penis, but they won’t be in penis awe. Come on, you can do better!"),
    powerPoints = 1.pp,
    linkedDrawbackChoice = { GenitalsAlwaysHard },
)


