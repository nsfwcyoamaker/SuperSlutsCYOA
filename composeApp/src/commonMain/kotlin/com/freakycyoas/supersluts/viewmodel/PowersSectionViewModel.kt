package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.powers.PowersAdditionalNaturalWeapon
import com.freakycyoas.supersluts.data.powers.PowersNaturalWeapon
import com.freakycyoas.supersluts.di.global
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.utils.replace
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

class PowersSectionViewModel(val group: LeveledChoicesGroup) {
    private val mainStateViewModel: MainStateViewModel by global.instance()

    private fun LeveledMainChoice.makeLeveledChoiceView(allChoices: List<Choice>): LeveledChoiceView {
        return LeveledChoiceView(
            mainChoice = LeveledChoiceState(
                choice = this,
                selectedLevel = (allChoices.singleOrNull { it::class == this::class } as? LeveledMainChoice)?.selectedLevel,
                isEnabled = this.canBeTaken(allChoices),
            ),
            drawback = this.getLinkedDrawbackChoice()?.let { drawback ->
                ChoiceState(
                    choice = drawback,
                    isSelected = allChoices.contains(drawback),
                    isEnabled = drawback.canBeTaken(allChoices),
                )
            }
        )
    }

    val powers: Flow<List<LeveledChoiceView>> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            group.choices.map { choiceOfGroup ->
                choiceOfGroup.makeLeveledChoiceView(allChoices)
            }
        }
    }

    val additionalNaturalWeapons: Flow<List<LeveledChoiceState>?> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            allChoices.filterIsInstance<PowersAdditionalNaturalWeapon>()
                .map {
                    LeveledChoiceState(
                        choice = it,
                        selectedLevel = it.selectedLevel,
                        isEnabled = true,
                    )
                }
                .takeIf { allChoices.any { it::class == PowersNaturalWeapon::class } }
        }
    }

    fun onLevelSelected(choice: LeveledMainChoice, level: ChoiceLevel) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice.ofLevel(level), it)
        }
    }

    fun onDrawbackSelected(choice: DrawbackChoice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice, it)
        }
    }

    fun makeNewAdditionalWeaponSlot() {
        mainStateViewModel.selectedChoices += PowersAdditionalNaturalWeapon()
    }

    fun removeAdditionalWeaponSlot(slot: LeveledMainChoice) {
        require(slot is PowersAdditionalNaturalWeapon)
        mainStateViewModel.selectedChoices -= slot
    }

    fun onSlotUpdated(slot: LeveledMainChoice, level: ChoiceLevel) {
        require(slot is PowersAdditionalNaturalWeapon)
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            if(slot.selectedLevel == level.number) {
                it.replace(slot, PowersAdditionalNaturalWeapon())
            } else {
                it.replace(slot, PowersAdditionalNaturalWeapon(level.number))
            }
        }
    }
}