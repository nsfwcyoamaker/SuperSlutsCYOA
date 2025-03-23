package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_MAKE_A_WISH

@Immutable
@Stable
object ContractsMakeAWish: MainChoice by com.freakycyoas.supersluts.data.contracts.ContractChoice(
    image = Res.drawable.contracts_MAKE_A_WISH,
    name = "MAKE A WISH",
    text = AnnotatedString("You will be put on the Make A Wish foundations wish list. Whenever a child with a clinical illness makes a wish involving you, you will be contacted and obligated to fulfill it! More often than not it will be a really perverted wish. But don’t worry any lewd wishes will be done in secrecy."),
    goldPoints = 10.gp,
)