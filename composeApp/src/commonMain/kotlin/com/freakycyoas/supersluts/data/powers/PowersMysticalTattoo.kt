package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_MYSTICAL_TATTOO

@Immutable
@Stable
object PowersMysticalTattoo: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_MYSTICAL_TATTOO,
    name = "MYSTICAL TATTOO",
    text = AnnotatedString("You have a mystical tattoo on your body and you get to decide how it looks, be creative! Your tattoo can be anything from mystical rune patterns to a whorish slut tattoo. I would prefer it if you went with the latter. A slutty crotch tattoo would look totally adorbs on you!"),
    givenPowerPoints = 5.pp,
    linkedMainChoice = { PowersHex::class },
)