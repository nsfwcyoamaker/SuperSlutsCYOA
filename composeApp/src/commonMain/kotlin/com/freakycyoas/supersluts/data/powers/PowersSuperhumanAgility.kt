package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_SUPERHUMAN_AGILITY

@Immutable
@Stable
class PowersSuperhumanAgility(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_SUPERHUMAN_AGILITY,
    name = "SUPERHUMAN AGILITY",
    levels = listOf(
        PowerLevel(1, (-7).pp, AnnotatedString("Your flexibility, grace and agility are beyond any human gymnast. You also become a master of parkour, allowing you to traverse difficult terrain with relative ease.")),
        PowerLevel(2, (-15).pp, AnnotatedString("Your agility far transcends the limits of biology. It’s next to impossible to avoid your attacks and predict your movement. There are no obvious holes in your defense as you can easily dodge attacks from any direction as long as you are aware of them.")),
        PowerLevel(3, (-25).pp, AnnotatedString("Your agility is completely uncanny, you fight like some kind of crazed spider monkey. You can easily outmaneuver your enemies in battle with your nimble movement and acrobatic maneuvers to attack them from unexpected angles like their blind spot.")),
    ),
    linkedDrawbackChoice = { PowersContortionist },
    selectedLevel = selectedLevel,
    constructor = ::PowersSuperhumanAgility,
)