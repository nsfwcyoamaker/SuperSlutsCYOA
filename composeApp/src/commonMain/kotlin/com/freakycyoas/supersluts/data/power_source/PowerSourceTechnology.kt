package com.freakycyoas.supersluts.data.power_source

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.power_source_TECHNOLOGY

@Immutable
@Stable
object PowerSourceTechnology: MainChoice by SimpleMainChoice(
    image = Res.drawable.power_source_TECHNOLOGY,
    name = "TECHNOLOGY",
    text = AnnotatedString("Your powers are 100% scientific and come from technology. For example, your superhuman physical abilities could come from a futuristic mecha suit which you wear or from being augmented with cybernetics, your regeneration could be caused by nanomachines inside your body and your telekinesis could come from a high tech brain implant. However, your sci-fi gadgets will need somewhat frequent maintenance and/or repairs, which you will have the knowledge to perform."),
    linkedDrawbackChoice = { PowerSourceCyborg },
    powerPoints = 10.pp,
    goldPoints = (-3).gp,
)