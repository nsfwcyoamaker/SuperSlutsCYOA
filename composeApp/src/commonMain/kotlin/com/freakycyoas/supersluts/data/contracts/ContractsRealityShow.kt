package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_REALITY_SHOW

@Immutable
@Stable
object ContractsRealityShow: MainChoice by ContractChoice(
    image = Res.drawable.contracts_REALITY_SHOW,
    name = "REALITY SHOW",
    text = AnnotatedString("You will be followed by an invisible camera drone 24/7 and your life will be live-streamed online. Whenever you shower, have sex or do anything embarrassing it will be recorded. Your fans will even be able to watch you while you’re sleeping. Your sponsor will hire actors to “spice up” your life if it gets too boring."),
    goldPoints = 20.gp,
    incompatibleWith = { listOf(SponsorWaltDisney) },
)