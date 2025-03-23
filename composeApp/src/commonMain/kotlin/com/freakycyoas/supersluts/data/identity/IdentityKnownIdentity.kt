package com.freakycyoas.supersluts.data.identity

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.identity_KNOWN_IDENTITY

object IdentityKnownIdentity: MainChoice by SimpleMainChoice(
    image = Res.drawable.identity_KNOWN_IDENTITY,
    name = "KNOWN IDENTITY",
    text = AnnotatedString("By not having a hidden identity you’ll soar in popularity! I just hope you know what you're getting yourself into. For better or worse, everyone will know where you live. Prepare yourself for an onslaught of pushy reporters, paparazzi and creepy stalker fangirls."),
    goldPoints = 10.gp
)