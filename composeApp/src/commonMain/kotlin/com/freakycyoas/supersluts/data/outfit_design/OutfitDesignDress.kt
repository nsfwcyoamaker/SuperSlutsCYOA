package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_DRESS

@Immutable
@Stable
object OutfitDesignDress: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_DRESS,
    name = "DRESS",
    text = AnnotatedString("Dresses are one of the most underrated outfits in the superhero business. There is also a wide variety of dress designs to choose from. For example, you can have a floor-sweeping gown, a magical girl dress, a mini dress, a ballerina dress or a revealing one-shoulder dress."),
)