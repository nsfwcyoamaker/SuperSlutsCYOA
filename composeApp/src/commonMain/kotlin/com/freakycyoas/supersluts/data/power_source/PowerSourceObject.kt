package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_OBJECT

@Immutable
@Stable
object PowerSourceObject: MainChoice by SimpleMainChoice(
    image = Res.drawable.power_source_OBJECT,
    name = "OBJECT",
    text = AnnotatedString("Choose any kind of item you want, for example, it could be a ring, gauntlet, a sword, pendant or a mask. Your powers are not your own, they are tied to the item you choose. You will only be able to use your powers when you are wearing or holding your item. There is no need to worry about the item, it will be completely indestructible. If someone would steal your item they would only be able to use your powers at half of their strength. If people find out that your item is your power source you can expect people to want to steal it. However, if your item gets lost or stolen fate will conspire to make your item find it’s way back to you after 2 weeks."),
    linkedDrawbackChoice = { PowerSourceSymbionte },
    powerPoints = 10.pp,
)