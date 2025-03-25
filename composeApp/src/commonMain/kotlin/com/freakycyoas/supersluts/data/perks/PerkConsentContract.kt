package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_CONSENT_CONTRACT

@Immutable
@Stable
object PerkConsentContract: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_CONSENT_CONTRACT,
    name = "CONSENT CONTRACT",
    text = AnnotatedString("By contract you will never be forced to have sex with anyone you find ugly or unattractive. None of your contracts will involve or force you to do anything sexual with a person whom you are not attracted to. To speak plainly your sponsor won't force you to do any gay shit. But if this results in you not getting your \"job\" done, you will be forced to lower your standards."),
    goldPoints = (-10).gp
)