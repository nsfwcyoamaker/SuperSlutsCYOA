package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_GENETICS

@Immutable
@Stable
object PowerSourceGenetics: MainChoice by SimpleMainChoice(
    image = Res.drawable.power_source_GENETICS,
    name = "GENETICS",
    text = AnnotatedString("Your superpowers are like part of your DNA, you’re like a naturally born superhero, mutant or some sort of superior lifeform. Most superheroes gain their powers from their unique genetics. Your powers will be a bit tricky to control in the beginning, but with some practice, you’ll master your powers in no time! Also since your powers are genetic, I should warn you that there are a lot of crazy fans out there that would do anything to give birth to a superhero."),
    linkedDrawbackChoice = { PowerSourceWeakness },
    powerPoints = 0.pp,
)