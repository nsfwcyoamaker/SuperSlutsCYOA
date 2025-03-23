package com.freakycyoas.supersluts.data.social_class

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.social_class_TRASHY
import com.freakycyoas.supersluts.model.pp

@Immutable
@Stable
object SocialClassTrashy: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.social_class_TRASHY,
    name = "TRASHY",
    text = AnnotatedString("Your taste in clothes will become really really trashy. You will want to dress like a 5 dollar whore or some kind of cheap sleazy gigolo."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { SocialClassLowerClass },
)