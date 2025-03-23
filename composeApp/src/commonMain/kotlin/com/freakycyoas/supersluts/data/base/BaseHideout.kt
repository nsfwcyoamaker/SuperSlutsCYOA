package com.freakycyoas.supersluts.data.base

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.GainsAndCosts
import com.freakycyoas.supersluts.data.RequirementsAndIncompatibilities
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.getChoiceDescription
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.theme.goldPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.base_HIDEOUT

private val text = AnnotatedString("A hideout is nothing too fancy, it could be an abandoned building, a small apartment, a basement in your house or anything similar. You will be able to keep your hero stuff in your hideout and it can serve as a meetup point if you decide to team up with other superheroes or get yourself a sidekick. It’s always good to have a place to lay low if a villain frames you for a crime you didn't commit or something. Your hideout's only defense against intruders will be its secret location.")

object BaseHideout: MainChoice by SimpleMainChoice(
    image = Res.drawable.base_HIDEOUT,
    name = "HIDEOUT",
    text = text,
    goldPoints = (-0).gp
) {
    override val description: AnnotatedString
        get() = getChoiceDescription(
            gainsAndCosts = GainsAndCosts(
                gains = emptyList(),
                costs = listOf(AnnotatedString("0", spanStyle = goldPointsStyle))
            ),
            requirementsAndIncompatibilities = RequirementsAndIncompatibilities(),
            description = text,
        )
}