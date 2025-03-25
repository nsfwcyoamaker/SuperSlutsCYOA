package com.freakycyoas.supersluts.data.gender

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.gender_chivalrous

@Immutable
@Stable
object GenderChivalrous: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.gender_chivalrous,
    name = "CHIVALROUS",
    text = AnnotatedString("Your subconscious mind will be altered to make you act like a perfect gentleman. You will be gallant, courteous and polite. Acting dishonorably, especially towards women becomes unthinkable to you."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { GenderMale },
)