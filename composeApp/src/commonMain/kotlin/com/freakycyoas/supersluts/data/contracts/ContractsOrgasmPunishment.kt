package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_ORGASM_PUNISHMENT

@Immutable
@Stable
object ContractsOrgasmPunishment: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_ORGASM_PUNISHMENT,
    name = "ORGASM PUNISHMENT",
    text = AnnotatedString("Whenever you perform poorly your sponsor will strap you into a sex machine that will stimulate your body and make your orgasm over and over, making you experience a never-ending orgasm hell, until they feel that you have been punished enough for your poor behavior. Here are some examples of things that will get you punished: if you let a villain escape, get captured by a villain, fail to complete a mission or create a PR scandal."),
    goldPoints = 10.gp,
    incompatibleWith = { listOf(com.freakycyoas.supersluts.data.contracts.ContractsOrgasmReward) }
)