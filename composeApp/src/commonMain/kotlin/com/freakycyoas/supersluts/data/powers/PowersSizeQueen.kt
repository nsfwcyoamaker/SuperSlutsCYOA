package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SIZE_QUEEN

@Immutable
@Stable
object PowersSizeQueen: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_SIZE_QUEEN,
    name = "SIZE QUEEN",
    text = AnnotatedString("To orgasm, you need something big like a huge bottle of champagne inserted into one of your orifices to cum. The bigger the inserted object the better it will feel. You will want to get really stretched out!"),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersElasticity::class },
    requires = { listOf(PowersElasticity()) },
)