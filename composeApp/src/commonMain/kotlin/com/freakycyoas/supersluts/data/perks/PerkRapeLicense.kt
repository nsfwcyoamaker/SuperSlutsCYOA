package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseNoLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_RAPE_LICENSE

@Immutable
@Stable
object PerkRapeLicense: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_RAPE_LICENSE,
    name = "RAPE LICENSE",
    text = AnnotatedString("Fighting sexy villains in skintight outfits day in and day out can be a bit sexually frustrating, to say the least. But if you purchase a rape license from OSI, you'll be able to legally rape anyone who has violated a law recently. Some less than reputable superheroes abuse their rape license to rape people who commit minor crimes like jaywalking."),
    incompatibleWith = { listOf(SponsorWaltDisney, SuperheroLicenseNoLicense) },
    goldPoints = (-5).gp
)