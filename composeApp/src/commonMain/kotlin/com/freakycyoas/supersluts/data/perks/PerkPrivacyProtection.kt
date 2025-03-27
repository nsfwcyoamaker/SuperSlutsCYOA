package com.freakycyoas.supersluts.data.perks

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.job.JobPornStar
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseNoLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_PRIVACY_PROTECTION

object PerkPrivacyProtection: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_PRIVACY_PROTECTION,
    name = "PRIVACY PROTECTION",
    text = AnnotatedString("By paying a monthly fee to OSI they will make it illegal and impossible to upload or share pornographic material of you. You will be able to sleep soundly knowing that whatever lewd shenanigans you get yourself into will never be exposed to the eye of the public. This option could help you prevent massive scandals or if you're a lewd superhero it could give you an aura of exclusivity and make you more desirable."),
    incompatibleWith = { listOf(SuperheroLicenseNoLicense, JobPornStar) },
    goldPoints = (-5).gp
)