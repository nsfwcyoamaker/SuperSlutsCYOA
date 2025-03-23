package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_GANGBANGER

@Immutable
@Stable
object PowersGangbanger: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_GANGBANGER,
    name = "GANGBANGER",
    text = AnnotatedString("Normal sex and masturbation will feel great, but it will no longer make you climax. You can only orgasm during group sex which involves at least 2 other people, clones will count as \"other people\"."),
    givenPowerPoints = 7.pp,
    linkedMainChoice = { PowersClone::class },
)