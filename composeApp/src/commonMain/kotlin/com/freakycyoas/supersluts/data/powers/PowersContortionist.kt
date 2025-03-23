package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_CONTORTIONIST

@Immutable
@Stable
object PowersContortionist: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_CONTORTIONIST,
    name = "CONTORTIONIST",
    text = AnnotatedString("Sitting and lying down like a regular human is now extremely uncomfortable for you, borderline painful. To relax you need to twist your body into some weird contortionist position."),
    givenPowerPoints = 8.pp,
    linkedMainChoice = { PowersSuperhumanAgility::class },
    requires = { listOf(PowersSuperhumanAgility()) },
)