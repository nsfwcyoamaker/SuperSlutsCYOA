package com.freakycyoas.supersluts.data.body_size

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.MultipleSpanDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_size_DOMINANT

@Immutable
@Stable
object BodySizeDominant: DrawbackChoice by MultipleSpanDrawbackChoice(
    image = Res.drawable.body_size_DOMINANT,
    name = "DOMINANT",
    text = AnnotatedString("You will become more confident, bold, strong-willed, decisive and dominant. You’ll be a natural leader, but sometimes you might come across as bullish, domineering and bossy. Taking on a supportive role in a hero team or a joint effort will leave you feeling frustrated, to say the least. Becoming someone’s sidekick would be almost unthinkable to you, you would second guess all of their decisions and would constantly try to convince them to do things your way. When it comes to sex you’ll be just as dominant, if not more."),
    givenPowerPoints = 10.pp,
    incompatibleWith = { listOf(
        BodySizeSubmissive,
        BodySizeSwitch
    ) },
    linkedMainChoices = { listOf(
        BodySizeTall,
        BodySizeColossal
    ) }
)
