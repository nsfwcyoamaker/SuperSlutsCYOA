package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.DefaultLeveledMainChoice
import com.freakycyoas.supersluts.data.PowerLevel
import com.freakycyoas.supersluts.data.power_source.PowerSourceMartialArts
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.powers_ELEMENT_MANIPULATION

@Immutable
@Stable
class PowersElementManipulation(selectedLevel: Int? = null): LeveledMainChoice by DefaultLeveledMainChoice(
    image = Res.drawable.powers_ELEMENT_MANIPULATION,
    name = "ELEMENT MANIPULATION",
    levels = listOf(
        PowerLevel(1, (-20).pp, AnnotatedString("Choose 1 element, your choices are fire, air, water, earth, ice, metal and electricity. You can manipulate your chosen element on a basic level. For example, you can throw fireballs, make it rain or erect stone barriers.")),
        PowerLevel(2, (-40).pp, AnnotatedString("Your control over your element is greatly improved. For example, you can trap a villain in a mini tornado, create multiple iron golems that fight for you or shoot a beam of freezing cold to encase people in ice.")),
        PowerLevel(3, (-70).pp, AnnotatedString("Your mastery over your element is on a whole other level. You can even summon your element from thin air and turn your body into your element. In your elemental form, you will be immune to mundane attacks, but you will be get damaged by some elements. For example, a metal form would be vulnerable to fire and electricity.")),
    ),
    linkedDrawbackChoice = { PowersSexualLiquidBending },
    selectedLevel = selectedLevel,
    constructor = ::PowersElementManipulation,
    incompatibleWith = { listOf(PowerSourceMartialArts) }
)