package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.powers.PowersSuperhumanIntelligence
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_SUPER_SCIENTIST

object JobSuperScientist: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_SUPER_SCIENTIST,
    name = "SUPER SCIENTIST",
    text = AnnotatedString("If you have the brains for it you could work as a super scientist and invent stuff. You get to choose 1 field to specialize in. For example, robots, weapons, vehicles, sex toys or genetics."),
    goldPoints = 11.gp,
    requires = { listOf(PowersSuperhumanIntelligence(3)) }
)