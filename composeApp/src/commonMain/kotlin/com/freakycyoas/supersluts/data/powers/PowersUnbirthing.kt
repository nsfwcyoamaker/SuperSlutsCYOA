package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_UNBIRTHING

@Immutable
@Stable
object PowersUnbirthing: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_UNBIRTHING,
    name = "UNBIRTHING",
    text = AnnotatedString("On rare occasions, you won’t be able to return to your full size until the majority of your body has spent at least 40 minutes inside someone else’s body. Like you would need to crawl up inside their pussy, anus, mouth or urethra."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersShrinking::class },
    requires = { listOf(PowersShrinking()) }
)