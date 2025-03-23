package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_black

@Immutable
@Stable
object HairColorBlack: MainChoice by SimpleMainChoice(
    image = Res.drawable.hair_black,
    name = "BLACK",
    text = AnnotatedString("Mysterious, exotic and reserved are just some traits that are associated with black hair. On the other hand, black haired people are thought to be more untrustworthy, cold and ruthless than people of other hair colors."),
    linkedDrawbackChoice = { HairColorSadist },
    powerPoints = 0.pp,
)