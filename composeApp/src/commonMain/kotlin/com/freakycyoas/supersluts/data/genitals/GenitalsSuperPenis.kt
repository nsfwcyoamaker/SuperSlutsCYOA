package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_SUPER_PENIS

@Immutable
@Stable
object GenitalsSuperPenis: MainChoice by SimpleMainChoice(
    image = Res.drawable.genitals_SUPER_PENIS,
    name = "SUPER PENIS",
    text = AnnotatedString("What about a super big penis? Because of its absurd size, it will inconvenience you in your everyday life and it might get in the way during your crimefighting and all but, it would totally be worth it, just trust me!"),
    powerPoints = 8.pp,
    linkedDrawbackChoice = { GenitalsLiquidFountain },
)


