package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.data.power_source.PowerSourceMartialArts
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.choiceSubtitleSpanStyle
import com.freakycyoas.supersluts.theme.powerPointsStyle
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUMMON_MINION

@Immutable
@Stable
class PowersSummonMinion(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUMMON_MINION,
    name = "SUMMON MINION",
    levels = listOf(
        PowerLevel(1, (-8).pp,
            buildAnnotatedString {
                append("You gain the power to summon, unsummon and control a minion. You get to decide your minion’s appearance, for example, it can be a colorful bodybuilder, succubus, animal or a golem. You also get to purchase powers for your minion, powers you buy for your minion will cost ")
                withStyle(powerPointsStyle) { append("50%") }
                append(" less ")
                withStyle(powerPointsStyle) { append("Power Points") }
                append(" rounded up. But you can only purchase level 1 powers for your minion and you can’t purchase ")
                withStyle(choiceSubtitleSpanStyle) { append("Summon Minion") }
                append(" or take any drawbacks for your minion. You must purchase at least 1 power for your minion.")
            }
        ),
        PowerLevel(
            2,
            (-40).pp,
            AnnotatedString("You can purchase level 2 powers for your minion.")
        ),
        PowerLevel(
            3,
            (-80).pp,
            AnnotatedString("You can purchase level 3 powers for your minion.")
        ),
    ),
    linkedDrawbackChoice = { PowersLustBornMinion },
    selectedLevel = selectedLevel,
    constructor = ::PowersSummonMinion,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)