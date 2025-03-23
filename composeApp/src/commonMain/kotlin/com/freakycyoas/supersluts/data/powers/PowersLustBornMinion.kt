package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_LUST_BORN_MINION

@Immutable
@Stable
object PowersLustBornMinion: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_LUST_BORN_MINION,
    name = "LUST BORN MINION",
    text = AnnotatedString("You don't get to choose what shape your minion will take. Instead, its appearance is based on what your subconscious mind finds the most sexually arousing. The more deprived you are, the more perverse its appearance will be."),
    givenPowerPoints = 4.pp,
    linkedMainChoice = { PowersSummonMinion::class },
    requires = { listOf(PowersSummonMinion()) }
)