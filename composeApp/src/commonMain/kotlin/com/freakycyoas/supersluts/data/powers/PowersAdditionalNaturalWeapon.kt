package com.freakycyoas.supersluts.data.powers

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.LeveledMainChoice

@Immutable
@Stable
class PowersAdditionalNaturalWeapon(selectedLevel: Int? = null): LeveledMainChoice by PowersNaturalWeapon(selectedLevel) {
    @Stable override fun getLinkedDrawbackChoice(): DrawbackChoice? = null
    override fun canBeTaken(allSelectedChoices: List<Choice>): Boolean {
        return allSelectedChoices.any { it is PowersNaturalWeapon }
    }
}