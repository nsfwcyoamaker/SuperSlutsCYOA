package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_UNIQUE_DESIGN

@Immutable
@Stable
object OutfitDesignUniqueDesign: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_UNIQUE_DESIGN,
    name = "UNIQUE DESIGN",
    text = AnnotatedString("If you didn’t like any of those designs you could always create your own outfit design. I’m open for ideas, just pitch them to me and I’ll work my magic to make your dream design a reality. Let’s blow them away with your unique outfit!"),
    incompatibleWith = { listOf(SponsorWaltDisney) }
)