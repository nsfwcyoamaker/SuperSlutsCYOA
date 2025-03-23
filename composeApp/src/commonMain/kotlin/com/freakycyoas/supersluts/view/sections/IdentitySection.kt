package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.identity.IdentityChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object IdentitySection: MainPageSection by SimpleSection(
    title = "IDENTITY",
    description = AnnotatedString("Most superheroes live a double life and have hidden identities. So how do you want to live your life? Having a hidden identity will allow you to live a relatively normal life, it will give you some time away from the spotlight. Being followed by paparazzi and overzealous fans all the time can be a bit exhausting and overwhelming for most people. But some love the attention it brings and thrives in it."),
    group = IdentityChoicesGroup,
)