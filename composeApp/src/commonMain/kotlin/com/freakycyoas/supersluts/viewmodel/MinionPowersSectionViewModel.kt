package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.powers.MinionPower
import com.freakycyoas.supersluts.data.powers.MinionPowersChoicesGroup
import com.freakycyoas.supersluts.di.global
import com.freakycyoas.supersluts.model.ChoiceLevel
import com.freakycyoas.supersluts.model.LeveledChoiceState
import com.freakycyoas.supersluts.model.LeveledChoiceView
import com.freakycyoas.supersluts.model.LeveledMainChoice
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

class MinionPowersSectionViewModel(summonMinionPowerLevel: Int) {
    private val mainStateViewModel: MainStateViewModel by global.instance()
    private val group = MinionPowersChoicesGroup(summonMinionPowerLevel)

    val choicesView: Flow<List<LeveledChoiceView>> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            val minionPowers = allChoices.filterIsInstance<MinionPower>()
            group.choices.map { choiceOfGroup ->
                LeveledChoiceView(
                    mainChoice = LeveledChoiceState(
                        choice = choiceOfGroup,
                        selectedLevel = minionPowers.singleOrNull { it.power::class == choiceOfGroup.power::class }?.selectedLevel,
                        isEnabled = choiceOfGroup.canBeTaken(allChoices),
                    ),
                    null
                )
            }
        }
    }

    fun onLevelSelected(choice: LeveledMainChoice, level: ChoiceLevel) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice.ofLevel(level), it)
        }
    }
}