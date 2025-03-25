package com.freakycyoas.supersluts.data.appearance

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.appearance_metahuman

@Immutable
@Stable
object AppearanceMetahuman: MainChoice by SimpleMainChoice(
    image = Res.drawable.appearance_metahuman,
    name = "METAHUMAN",
    text = AnnotatedString("You must choose to gain at least minor biologically impossible body feature. For example, your hair is made out of slime, your eyes glow red or your hair is made out of harmless fire."),
    powerPoints = 4.pp,
    linkedDrawbackChoice = { AppearanceOtherworldly },
)