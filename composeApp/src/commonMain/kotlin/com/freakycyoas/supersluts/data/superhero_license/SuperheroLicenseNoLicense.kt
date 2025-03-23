package com.freakycyoas.supersluts.data.superhero_license

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.superhero_license_NO_LICENSE

@Immutable
@Stable
object SuperheroLicenseNoLicense: MainChoice by SimpleMainChoice(
    image = Res.drawable.superhero_license_NO_LICENSE,
    name = "NO LICENSE",
    text = AnnotatedString("Well, you don’t have to buy a superhero license to be a hero. You could always be a mysterious vigilante who operates outside of the boundaries of the law and punishes those beyond the laws reach. There is something really romantic about being a vigilante. However, OSI will put a bounty on your ass and superheroes will try to capture you for a big juicy reward. If you’re captured you will get sent to a super prison where supervillains are kept."),
    goldPoints = (-0).gp,
)