package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.MultipleSpanDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_SUBMISSIVE

@Immutable
@Stable
object BodySizeSubmissive: DrawbackChoice by MultipleSpanDrawbackChoice(
    image = Res.drawable.body_size_SUBMISSIVE,
    name = "SUBMISSIVE",
    text = AnnotatedString("You will become more compliant, obedient, passive and less independent. It will feel good to follow orders, serve and please others, not just as a hero but in the bedroom too, especially in the bedroom. In a team of superheroes and superheroines or in a joint effort you will naturally look for guidance and a strong leader to follow. You’ll also prefer to take on a supporting role rather than a leading role. While you could strike out as a solo hero, you would be much more confident being a member of a hero team or taking the role of a sidekick."),
    givenPowerPoints = 10.pp,
    incompatibleWith = { listOf(
        BodySizeSwitch,
        BodySizeDominant
    ) },
    linkedMainChoices = { listOf(
        BodySizeTiny,
        BodySizeSmall,
        BodySizeShort
    ) }
)
