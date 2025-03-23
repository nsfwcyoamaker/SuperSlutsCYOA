package com.freakycyoas.supersluts.data.base

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.base_SECRET_BASE

object BaseSecretBase: MainChoice by SimpleMainChoice(
    image = Res.drawable.base_SECRET_BASE,
    name = "SECRET BASE",
    text = AnnotatedString("Your base is much bigger, big enough to store large vehicles. It will also be equipped with supercomputers and several security systems. It even comes with a holographic training room. Your security will be able to repel normal humans, like snooping reporters or low tier villains, but it would at best slow down a strong super-powered intruder. A secret base can be anything from an underground facility under your house to a secret cave behind a waterfall."),
    goldPoints = (-10).gp
)