package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_white

@Immutable
@Stable
object HairColorWhite: MainChoice by SimpleMainChoice(
    image = Res.drawable.hair_white,
    name = "WHITE",
    text = AnnotatedString("White hair is associated with purity, virtue, wisdom and maturity. However white haired people are also viewed as cold, distant and introvert."),
    linkedDrawbackChoice = { HairColorEmotionless },
    powerPoints = 1.pp,
)
