package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_MIND_FUCKED

@Immutable
@Stable
object PowersMindFucked: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_MIND_FUCKED,
    name = "MIND FUCKED",
    text = AnnotatedString("Whenever you use your telepathy on someone who is fantasizing about sex, having sex or looking at porn, you will get mentally dragged into the lewd scenario. Experiencing everything 1 random person in the scenario is experiencing."),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { PowersTelepathy::class },
    requires = { listOf(PowersTelepathy()) },
)