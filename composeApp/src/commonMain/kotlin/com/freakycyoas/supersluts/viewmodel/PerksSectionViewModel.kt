package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.perks.GeneticModificationPower
import com.freakycyoas.supersluts.data.perks.PerksChoicesGroup
import com.freakycyoas.supersluts.model.ChoiceLevel
import com.freakycyoas.supersluts.model.LeveledChoiceState
import com.freakycyoas.supersluts.model.LeveledChoiceView
import com.freakycyoas.supersluts.model.LeveledMainChoice
import com.freakycyoas.supersluts.utils.replace
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PerksSectionViewModel: MixedSectionViewModel(PerksChoicesGroup) {
    val geneticModificationPowers: Flow<List<LeveledChoiceView>> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            allChoices
                .filterIsInstance<GeneticModificationPower>()
                .map { choice ->
                    LeveledChoiceView(
                        mainChoice = LeveledChoiceState(
                            choice = choice,
                            selectedLevel = choice.selectedLevel,
                            isEnabled =  true,
                        ),
                        drawback = null,
                    )
                }
        }
    }

    fun onGeneticModificationPowerLevelSelected(choice: LeveledMainChoice, level: ChoiceLevel) {
        val geneticModification = (choice as? GeneticModificationPower) ?: throw IllegalArgumentException()

        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            if(geneticModification.selectedLevel == level.number) {
                it.minus(geneticModification)
            } else {
                it.replace(geneticModification, geneticModification.ofLevel(level))
            }
        }
    }
}