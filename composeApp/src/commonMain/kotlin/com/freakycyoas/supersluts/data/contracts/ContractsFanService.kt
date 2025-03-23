package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_FAN_SERVICE

@Immutable
@Stable
object ContractsFanService: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_FAN_SERVICE,
    name = "FAN SERVICE",
    text = AnnotatedString("You will be given a booth on the biggest superhero conventions. You must attend these conventions and you’ll be expected to meet and greet fans, sign autographs and sell sexy photos of yourself. Your fans will also get to decide on a skimpy outfit that you must wear during the convention in an online poll."),
    goldPoints = 5.gp,
)