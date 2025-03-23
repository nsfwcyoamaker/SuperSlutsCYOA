package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.data.DefaultLeveledChoicesGroup
import com.freakycyoas.supersluts.model.LeveledChoicesGroup

@Stable
@Immutable
object PowersChoicesGroup: LeveledChoicesGroup by com.freakycyoas.supersluts.data.DefaultLeveledChoicesGroup(
    listOf(
        PowersSuperhumanStrength(),
        PowersSuperhumanDurability(),
        PowersSuperhumanSenses(),
        PowersSuperhumanSpeed(),
        PowersSuperhumanReflexes(),
        PowersSuperhumanAgility(),
        PowersSuperhumanIntelligence(),
        PowersTelepathy(),
        PowersTelekinesis(),
        PowersAmphibic(),
        PowersFlight(),
        PowersTeleportation(),
        PowersIntangibility(),
        PowersRegeneration(),
        PowersForcefieldGeneration(),
        PowersEnergyManipulation(),
        PowersClone(),
        PowersInvisibility(),
        PowersElementManipulation(),
        PowersAbsorbPower(),
        PowersPowerMode(),
        PowersShrinking(),
        PowersEnlargement(),
        PowersShapeshifting(),
        PowersWeaponMastery(),
        PowersElasticity(),
        PowersNaturalWeapon(),
        PowersHealing(),
        PowersSummonMinion(),
        PowersHex(),
    ),
)