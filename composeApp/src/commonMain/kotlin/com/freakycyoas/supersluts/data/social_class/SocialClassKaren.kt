package com.freakycyoas.supersluts.data.social_class

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.social_class_KAREN
import com.freakycyoas.supersluts.model.pp

@Immutable
@Stable
object SocialClassKaren: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.social_class_KAREN,
    name = "KAREN",
    text = AnnotatedString("You become extremely entitled and demanding when dealing with customer service. You will often find yourself “speaking to the manager”."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { SocialClassMiddleClass },
)