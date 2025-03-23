package com.freakycyoas.supersluts.data.hair_color

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.hair_unnatural

@Immutable
@Stable
object HairColorUnnatural: MainChoice by SimpleMainChoice(
    image = Res.drawable.hair_unnatural,
    name = "UNNATURAL",
    text = AnnotatedString("Why settle for a mortal hair color? You can have any hair color you want! Pink hair, blue hair, green hair or why not rainbow colored hair? The sky is the limit!"),
    linkedDrawbackChoice = { HairColorDaddyIssues },
    powerPoints = 3.pp,
)
