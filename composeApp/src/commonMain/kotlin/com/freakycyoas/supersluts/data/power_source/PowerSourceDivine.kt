package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_DIVINE

@Immutable
@Stable
object PowerSourceDivine: MainChoice by SimpleMainChoice(
    image = Res.drawable.power_source_DIVINE,
    name = "DIVINE",
    text = AnnotatedString("Alternatively, your powers could be divine in nature by pledging yourself to a deity and becoming their champion. As much as I would love to make you my champion, by interdimensional deity law you must choose a deity from your original world. Yes, that means you could choose Aphrodite, Thor, Ra or Bacchus to name a few. As the champion of a deity, you would have to live your life according to your deities tenets. For example, Bacchus would want you to drink and party a lot. If you don’t do that, you will lose Bacchus’s favor and your powers. But you can always regain his favor and your powers by drinking and partying a lot. You must also purchase 2 powers that are thematic for your deity."),
    linkedDrawbackChoice = { PowerSourceLolicon },
    powerPoints = 10.pp,
)