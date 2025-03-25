package com.freakycyoas.supersluts.data.body_figure

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.body_figure_PETITE

@Immutable
@Stable
object BodyFigurePetite: MainChoice by SimpleMainChoice(
    image = Res.drawable.body_figure_PETITE,
    name = "PETITE",
    text = AnnotatedString("How about I make you thin, lithe, delicate and dainty? You’ll be the pinnacle of elegance and femininity, a statue of beauty! Your thin frame will make you look vulnerable, yet strong and courageous!"),
    powerPoints = 1.pp,
    linkedDrawbackChoice = { BodyFigureFreckles },
)