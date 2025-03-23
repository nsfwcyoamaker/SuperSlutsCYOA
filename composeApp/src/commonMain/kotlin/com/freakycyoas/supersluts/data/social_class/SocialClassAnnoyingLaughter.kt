package com.freakycyoas.supersluts.data.social_class

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.social_class_ANNOYING_LAUGHTER

@Immutable
@Stable
object SocialClassAnnoyingLaughter: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.social_class_ANNOYING_LAUGHTER,
    name = "ANNOYING LAUGHTER",
    text = AnnotatedString("You will now have the obnoxious ojou-sama laugh. When normal people laugh they will be all like “Hahahaha”, but you will go all “Oooohohohoh”."),
    givenPowerPoints = 4.pp,
    linkedMainChoice = { SocialClassUpperClass },
)