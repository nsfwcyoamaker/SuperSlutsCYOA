package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_PERSONA

@Immutable
@Stable
object ContractsPersona: MainChoice by ContractChoice(
    image = Res.drawable.contracts_PERSONA,
    name = "PERSONA",
    text = AnnotatedString("Fans love strong personalities, and your personality is honestly a bit too boring. Your sponsor is willing to pay you for adopting a persona for your superhero identity. For example, you could be a paragon of virtue. A shining beacon of hope, righteousness, kindness and compassion!"),
    goldPoints = 5.gp,
)