package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_VAGINA

@Immutable
@Stable
object GenitalsVagina: MainChoice by SimpleMainChoice(
    image = Res.drawable.genitals_VAGINA,
    name = "VAGINA",
    text = AnnotatedString("You will have a vagina, I can make it an innie, outy or roasty pussy, whatever you want!"),
    powerPoints = 2.pp,
    linkedDrawbackChoice = { GenitalsPenisVagina },
)


