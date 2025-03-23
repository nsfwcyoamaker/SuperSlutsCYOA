package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.LeveledDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_NEARLY_MORTAL

@Immutable
@Stable
object PowersNearlyMortal: DrawbackChoice by LeveledDrawbackChoice(
    image = Res.drawable.powers_NEARLY_MORTAL,
    name = "NEARLY MORTAL",
    text = AnnotatedString("No matter your superpowers, you will still feel pain when your body is attacked as if you were a normal human and you will get light bruises. The bruises are completely cosmetic."),
    givenPowerPoints = 15.pp,
    linkedMainChoice = { PowersSuperhumanDurability::class },
    requires = { listOf(PowersIntangibility(), PowersSuperhumanDurability(2)) },
    requiresAll = false
)