package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_EMOTIONAL_ATTUNEMENT

@Immutable
@Stable
object PowerSourceEmotionalAttunement: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.power_source_EMOTIONAL_ATTUNEMENT,
    name = "EMOTIONAL ATTUNEMENT",
    text = AnnotatedString("Choose 1 emotion that you are attuned to. Whenever you use your powers you cannot use them at their full strength, your powers will be 1 level lower unless you are affected by the emotion which you are attuned towards. The stronger you are feeling your attuned emotion the less mana will your powers require as they will partially be fueled by your emotion. I recommend that you choose lust as your emotion, then you could totally just dress like a slut and then get all hot and bothered by all the looks people will give you."),
    givenPowerPoints = 20.pp,
    linkedMainChoice = { PowerSourceMagic },
)
