package com.freakycyoas.supersluts.data.superhero_license

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.superhero_license_SUPERHERO_LICENSE

@Immutable
@Stable
object SuperheroLicenseSuperheroLicense: MainChoice by SimpleMainChoice(
    image = Res.drawable.superhero_license_SUPERHERO_LICENSE,
    name = "SUPERHERO LICENSE",
    text = AnnotatedString("Superheroes destroy a lot of things to save people and battle supervillains. Having a superhero license is like having a license to destroy things. Don’t worry about the destruction you cause, OSI will pay for it. You can even break laws as long as the action you take is morally defendable, like stealing a car during a car chase. You will also get rescued within 1 week if a supervillain takes you captive."),
    goldPoints = (-20).gp,
)