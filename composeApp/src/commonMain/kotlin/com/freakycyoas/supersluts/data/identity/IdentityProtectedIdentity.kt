package com.freakycyoas.supersluts.data.identity

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.contracts.ContractsRealityShow
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseNoLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.identity_PROTECTED_IDENTITY

object IdentityProtectedIdentity: MainChoice by SimpleMainChoice(
    image = Res.drawable.identity_PROTECTED_IDENTITY,
    name = "PROTECTED IDENTITY",
    text = AnnotatedString("OSI will actively act to protect your hidden identity, they’ll sue people who try to reveal your identity and powerful telepathic superheroes will remove other people’s memories of your identity if it is ever exposed."),
    goldPoints = (-10).gp,
    incompatibleWith = { listOf(SuperheroLicenseNoLicense, ContractsRealityShow) }
)