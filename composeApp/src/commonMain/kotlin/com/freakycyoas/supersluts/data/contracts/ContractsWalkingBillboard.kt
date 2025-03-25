package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_WALKING_BILLBOARD

@Immutable
@Stable
object ContractsWalkingBillboard: MainChoice by ContractChoice(
    image = Res.drawable.contracts_WALKING_BILLBOARD,
    name = "WALKING BILLBOARD",
    text = AnnotatedString("You’re a walking billboard. Anyone can pay for a spot on your superhero outfit where they can place a logo, image or whatever they want. Depending on how your outfit looks like, you might have to get temporary tattoos on your body if there is not enough space on your outfit."),
    goldPoints = 5.gp,
)