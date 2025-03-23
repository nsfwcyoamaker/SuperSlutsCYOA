package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_TWO_PIECE_OUTFIT

@Immutable
@Stable
object OutfitDesignTwoPieceOutfit: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_TWO_PIECE_OUTFIT,
    name = "TWO-PIECE OUTFIT",
    text = AnnotatedString("A two-piece outfit can be anything from a mini-skirt and a top to pants and a top. As long as the outfit consists of two pieces and at least 50% of the outfit is skin-tight it will count as a two-piece outfit. So you can be really creative with this option."),
)