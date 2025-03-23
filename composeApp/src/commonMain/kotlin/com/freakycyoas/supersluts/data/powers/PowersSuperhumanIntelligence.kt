package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.data.hair_color.HairColorAirhead
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUPERHUMAN_INTELLIGENCE

@Immutable
@Stable
class PowersSuperhumanIntelligence(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUPERHUMAN_INTELLIGENCE,
    name = "SUPERHUMAN INTELLIGENCE",
    levels = listOf(
        PowerLevel(1, (-8).pp, AnnotatedString("You got a perfect memory and won’t forget anything. Learning new things like languages, for example, is super easy for you.")),
        PowerLevel(2, (-25).pp, AnnotatedString("You’re a genius! You got extremely good problem-solving skills and can analyze the world around you to make unimaginable calculations. For example, you could instantly calculate how a bullet will ricochet and make impossible shots or calculate which spot to aim for to do the maximum amount of damage on your enemies.")),
        PowerLevel(3, (-65).pp, AnnotatedString("You can now invent high tech tools, gadgets, robots and stuff like that. Generally, the more powerful and useful your inventions are the more time, effort and money it will take to invent them.")),
    ),
    linkedDrawbackChoice = { PowersPervertedNerd },
    selectedLevel = selectedLevel,
    constructor = ::PowersSuperhumanIntelligence,
    incompatibleWith = { listOf(HairColorAirhead) }
)