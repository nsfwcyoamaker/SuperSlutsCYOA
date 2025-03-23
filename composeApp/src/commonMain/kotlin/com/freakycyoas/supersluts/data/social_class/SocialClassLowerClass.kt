package com.freakycyoas.supersluts.data.social_class

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.social_class_LOWER_CLASS

@Immutable
@Stable
object SocialClassLowerClass: MainChoice by SimpleMainChoice(
    image = Res.drawable.social_class_LOWER_CLASS,
    name = "LOWER CLASS",
    text = AnnotatedString("You’ll barely have enough money to pay your bills. You will have to use coupons, exploit sales and squeeze every penny in order to afford things beyond necessities like food. I’ll get you a small apartment to live in, it’s not much, but it’s yours. Since the apartment will be a bit empty, I’ll move all of your current possessions that fit inside the apartment and decorate it for you. Are you sure you want to live like this?"),
    linkedDrawbackChoice = { SocialClassTrashy },
    goldPoints = (-0).gp,
)