package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUPER_ARROGANT

@Immutable
@Stable
object PowersSuperArrogant: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SUPER_ARROGANT,
    name = "SUPER ARROGANT",
    text = AnnotatedString("You gain a huge ego. You’ll often find yourself overestimating your own abilities and underestimating your enemies. Due to your arrogance, you will often lose battles that you should have won easily. Because you act like an arrogant bitch your enemies are much more likely to rape you."),
    givenPowerPoints = 12.pp,
    linkedMainChoice = { PowersTelekinesis::class }
)