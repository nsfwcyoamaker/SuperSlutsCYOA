package com.freakycyoas.supersluts.data.identity

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.contracts.ContractsRealityShow
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.identity_SECRET_IDENTITY

object IdentitySecretIdentity: MainChoice by SimpleMainChoice(
    image = Res.drawable.identity_SECRET_IDENTITY,
    name = "SECRET IDENTITY",
    text = AnnotatedString("You’ll have a secret identity. But it will only remain secret for as long as it remains secret. Watch out for snooping reporters and overzealous fans. Some supervillains also take joy in unmasking superheroes."),
    goldPoints = 0.gp,
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.contracts.ContractsRealityShow) }
)