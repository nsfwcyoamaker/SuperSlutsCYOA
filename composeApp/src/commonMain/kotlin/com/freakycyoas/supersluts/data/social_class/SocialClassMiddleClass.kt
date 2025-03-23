package com.freakycyoas.supersluts.data.social_class

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.social_class_MIDDLE_CLASS

@Immutable
@Stable
object SocialClassMiddleClass: MainChoice by SimpleMainChoice(
    image = Res.drawable.social_class_MIDDLE_CLASS,
    name = "MIDDLE CLASS",
    text = AnnotatedString("You will get your own house, fully furnished and stocked with everyday items that your social class would be able to afford. Your salary will be above average, you will be able to afford to buy nice things you want as long as you save up the money for it, like a sports car, but you’re far from being rich."),
    linkedDrawbackChoice = { SocialClassKaren },
    goldPoints = (-20).gp,
)