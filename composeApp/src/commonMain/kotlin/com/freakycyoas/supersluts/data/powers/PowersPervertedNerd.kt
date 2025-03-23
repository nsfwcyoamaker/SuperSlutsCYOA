package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_PERVERTED_NERD

@Immutable
@Stable
object PowersPervertedNerd: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_PERVERTED_NERD,
    name = "PERVERTED NERD",
    text = AnnotatedString("Normal sex no longer excites you, you’re a degenerate nerd who only gets turned on by extreme fetishes like fisting, huge insertions, bestiality, waterspouts, unbirthing, hardcore BDSM, olfactophilia, lolicon, tentacle rape, futanari, ryona and other /d/ tier fetishes."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { PowersSuperhumanIntelligence::class },
)