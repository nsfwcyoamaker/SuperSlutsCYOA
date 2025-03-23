package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_DATE_LOTTERY

@Immutable
@Stable
object ContractsDateLottery: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_DATE_LOTTERY,
    name = "DATE LOTTERY",
    text = AnnotatedString("Each month your fans can buy tickets for your personal date lottery. The winner gets to take you out on a date and spend an entire day with you. However, you will be under contract to keep any relationships you might have a secret and pretend to be single. Your fans must believe you’re available and that they have a genuine shoot. Otherwise, no one would be interested in buying tickets to the date lottery."),
    goldPoints = 5.gp,
)