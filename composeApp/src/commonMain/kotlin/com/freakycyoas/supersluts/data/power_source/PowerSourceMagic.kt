package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_MAGIC

@Immutable
@Stable
object PowerSourceMagic: MainChoice by SimpleMainChoice(
    image = Res.drawable.power_source_MAGIC,
    name = "MAGIC",
    text = AnnotatedString("Your powers come from the supernatural. You will harness arcane energy known as mana to fuel your spells, I mean superhero powers. Ok, I’m not fooling anyone here, you’re a mage, you cast spells and you need mana. This means you have a limited amount of mana to fuel your powers with. While you will have a large mana pool it would still be wise to try and keep your battles short to avoid running out of mana. Your mana pool will refill over time. You can speed up your mana regeneration by performing arcane rituals which will instantly refill your mana pool once preformed, but those rituals are best used outside of combat."),
    linkedDrawbackChoice = { PowerSourceEmotionalAttunement },
    powerPoints = 10.pp,
)