package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_BRAINWASHING

@Immutable
@Stable
object ContractsBrainwashing: MainChoice by ContractChoice(
    image = Res.drawable.contracts_BRAINWASHING,
    name = "BRAINWASHING",
    text = AnnotatedString("Your sponsor will brainwash you in order to prevent you from breaking character. While wearing your superhero outfit your personality will be replaced with your superhero persona. It will feel like becoming a completely different person."),
    goldPoints = 5.gp,
    requires = { listOf(ContractsPersona) }
)