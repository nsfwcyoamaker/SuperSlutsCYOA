package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.superhero_license.SuperheroLicenseSidekickLicense
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_TEAM_LEADER

@Immutable
@Stable
object PerkTeamLeader: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_TEAM_LEADER,
    name = "TEAM LEADER",
    text = AnnotatedString("Being in a hero team is nice, but is it not nicer to be the leader of the team? Like fuck voting and equal say. As the leader, you would call all the shots and make all the important decisions. Like choosing what missions your team will accept. You could all have matching outfits or maybe not. That would be your choice since you would be the leader. You would also be the face of the team, you would get the most attention from the press and you would also get the most credit for your team's achievements."),
    incompatibleWith = { listOf(SuperheroLicenseSidekickLicense) },
    goldPoints = (-5).gp
)

