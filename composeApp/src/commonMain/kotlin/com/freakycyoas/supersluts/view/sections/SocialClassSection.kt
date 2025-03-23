package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.social_class.SocialClassChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object SocialClassSection: MainPageSection by SimpleSection(
    title = "SOCIAL CLASS",
    description = AnnotatedString("Being a hero is not about money. But money is pretty nice, is it not? Wouldn’t you be a more competent crimefighter if you made more money? So how much money do you want to make doing this whole superhero thing?"),
    group = SocialClassChoicesGroup,
)