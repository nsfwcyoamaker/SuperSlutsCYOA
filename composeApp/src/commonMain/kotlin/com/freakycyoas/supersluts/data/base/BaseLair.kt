package com.freakycyoas.supersluts.data.base

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.base_LAIR

object BaseLair: MainChoice by SimpleMainChoice(
    image = Res.drawable.base_LAIR,
    name = "LAIR",
    text = AnnotatedString("A lair is like a secret base but better! Now your base will be isolated with lead to prevent X-ray spying, it’s made 100% soundproof and several other measures have been taken to make it almost impossible to find your base. The security systems are upgraded too, they will now be able to repel super-powered individuals, it would take a large group of organized and extremely powerful villains to successfully invade your base."),
    goldPoints = (-20).gp
)