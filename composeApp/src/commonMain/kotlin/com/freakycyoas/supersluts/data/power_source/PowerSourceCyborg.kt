package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_CYBORG

@Immutable
@Stable
object PowerSourceCyborg: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.power_source_CYBORG,
    name = "CYBORG",
    text = AnnotatedString("You might or might not look like it, but you’re a cyborg. You’re more machine than human. What’s more concerning is that a supervillain with superhuman intelligence could do all kinds of kinky shit to you after you’re defeated. Never-ending orgasms, re- programmed personality or rebuilding your body to turn you into a sexbot are just a few things they can do. You can always be restored to your normal state once you’re saved."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowerSourceTechnology },
)