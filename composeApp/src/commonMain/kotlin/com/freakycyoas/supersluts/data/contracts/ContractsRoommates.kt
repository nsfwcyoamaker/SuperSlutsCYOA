package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_ROOMMATES

@Immutable
@Stable
object ContractsRoommates: MainChoice by ContractChoice(
    image = Res.drawable.contracts_ROOMMATES,
    name = "ROOMMATES",
    text = AnnotatedString("Multiple studies have show that heroes who live together form stronger bonds and perform better as a team. You and your team members will eat, sleep and live together under the same roof. They will also share all of your contracts, which will be fulfilled together as a team. If you’re someone who enjoys alone time, this isn’t the option for you."),
    goldPoints = 5.gp,
) {
    //TODO Requirement: Must purchase 1 or more team members.
}