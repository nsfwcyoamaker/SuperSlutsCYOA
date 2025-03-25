package com.freakycyoas.supersluts.data.contracts

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.contracts_SLAVE_LOTTERY

@Immutable
@Stable
object ContractsSlaveLottery: MainChoice by ContractChoice(
    image = Res.drawable.contracts_SLAVE_LOTTERY,
    name = "SLAVE LOTTERY",
    text = AnnotatedString("This option is similar to Date Lottery but instead of winning a date, the winner gets to keep you as sex slave for a day. They can do whatever they want to you short of physically abusing you. Spanking, light choking and slapping you is fine tho. They could tie you up in bondage and use you as a hug pillow, parade you around naked while forcing you to wear a leash and behave like a dog or they could just fuck your brains out."),
    goldPoints = 15.gp,
    requires = { listOf(SponsorXoxo) }
)