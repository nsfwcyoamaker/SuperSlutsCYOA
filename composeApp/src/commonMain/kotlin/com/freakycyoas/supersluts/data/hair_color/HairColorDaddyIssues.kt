package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_daddy_issues

@Immutable
@Stable
object HairColorDaddyIssues: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.hair_daddy_issues,
    name = "DADDY ISSUES",
    text = AnnotatedString("You absolutely hate and despise men, yes all men. You will instinctively act like a passive-aggressive little bitch whenever you interact with a man, be it the president or a starving homeless man."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { HairColorUnnatural },
)