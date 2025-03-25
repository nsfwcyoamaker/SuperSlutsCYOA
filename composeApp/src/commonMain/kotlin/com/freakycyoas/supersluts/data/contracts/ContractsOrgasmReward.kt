package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_ORGASM_REWARD

@Immutable
@Stable
object ContractsOrgasmReward: MainChoice by ContractChoice(
    image = Res.drawable.contracts_ORGASM_REWARD,
    name = "ORGASM REWARD",
    text = AnnotatedString("Your sponsor will equip you with a chastity device that makes it impossible for you to orgasm. Only with the help of your sponsor can the device be removed. Now your sponsor will decide when you get to cum. Which is only when you have caught a villain or done something which has benefited your sponsor. Like receiving good publicity from a newspaper for saving the president."),
    goldPoints = 30.gp,
    incompatibleWith = { listOf(ContractsOrgasmPunishment) }
)