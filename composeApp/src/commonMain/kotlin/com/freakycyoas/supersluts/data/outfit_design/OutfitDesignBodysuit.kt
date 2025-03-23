package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_BODYSUIT

@Immutable
@Stable
object OutfitDesignBodysuit: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_BODYSUIT,
    name = "BODYSUIT",
    text = AnnotatedString("What could be a more iconic outfit for a superhero than a skin-tight bodysuit? It’s an age-old classic and for a good reason. Everyone will be able to admire your perfectly sculpted body in this outfit, while at the same time hiding your naughty bits and leaving them to the imagination of the viewer."),
)