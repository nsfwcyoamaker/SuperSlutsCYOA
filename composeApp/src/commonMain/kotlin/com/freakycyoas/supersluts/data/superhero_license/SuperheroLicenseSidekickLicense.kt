package com.freakycyoas.supersluts.data.superhero_license

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.superhero_license_SIDEKICK_LICENSE

@Immutable
@Stable
object SuperheroLicenseSidekickLicense: MainChoice by SimpleMainChoice(
    image = Res.drawable.superhero_license_SIDEKICK_LICENSE,
    name = "SIDEKICK LICENSE",
    text = AnnotatedString("A sidekick license is much cheaper than a superhero license. As a sidekick, the superhero you pair up with will be responsible for your actions and you must obey their every command. Some superheroes take advantage of this if you know what I mean. Once you have been a sidekick for 10-15 years your mentor can send in an official recommendation to OSI that would upgrade your sidekick license to a superhero license or if you want to you could always continue being a sidekick."),
    goldPoints = (-10).gp,
    incompatibleWith = { listOf(SponsorBlissIndustries) }
)