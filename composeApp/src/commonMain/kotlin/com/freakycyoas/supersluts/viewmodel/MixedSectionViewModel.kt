package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.di.global
import com.freakycyoas.supersluts.model.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

class MixedSectionViewModel(val group: ChoicesGroup) {
    private val mainStateViewModel: MainStateViewModel by global.instance()

    private fun PointTransferMainChoice.makePointTransferChoiceView(allChoices: List<Choice>): PointTransferChoiceView {
        val selectedInstance = allChoices
            .filterIsInstance<PointTransferMainChoice>()
            .singleOrNull { it::class == this::class }

        val default = group.choices
            .filterIsInstance<PointTransferMainChoice>()
            .single { it::class == this::class }

        return PointTransferChoiceView(
            mainChoice = PointTransferChoiceState(
                choice = this,
                isSelected = selectedInstance != null,
                isEnabled = this.canBeTaken(allChoices),
                amount = selectedInstance?.amountTransferred ?: 0,
                consumedPoints = selectedInstance?.consumedPoints() ?: default.consumedPoints(),
                gainedPoints = selectedInstance?.grantedPoints() ?: default.grantedPoints(),
            ),
        )
    }

    private fun MultiselectMainChoice.makeMultiselectChoiceView(allChoices: List<Choice>): MultiselectChoiceView {
        val selectedInstance = allChoices
            .filterIsInstance<MultiselectMainChoice>()
            .singleOrNull { it::class == this::class }
            ?: this

        return MultiselectChoiceView(
            mainChoice = MultiselectChoiceState(
                choice = this,
                selectedChoices = selectedInstance.selectedChoices,
                selectableChoices = selectedInstance.getPossibleSelections(allChoices),
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

    private fun MultibuyMainChoice.makeMultibuyChoiceView(allChoices: List<Choice>): MultibuyChoiceView {
        val selectedInstance = allChoices
            .filterIsInstance<MultibuyMainChoice>()
            .singleOrNull { it::class == this::class }

        return MultibuyChoiceView(
            mainChoice = MultibuyChoiceState(
                choice = this,
                boughtTimes = selectedInstance?.boughtTimes ?: 0,
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

    private fun LeveledMainChoice.makeLeveledChoiceView(allChoices: List<Choice>): LeveledChoiceView {
        val selectedInstance = allChoices
            .filterIsInstance<LeveledMainChoice>()
            .singleOrNull { it::class == this::class }

        return LeveledChoiceView(
            mainChoice = LeveledChoiceState(
                choice = this,
                selectedLevel = selectedInstance?.selectedLevel,
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

    private fun MainChoice.makeSimpleChoiceView(allChoices: List<Choice>): ChoiceView {
        return ChoiceView(
            mainChoice = ChoiceState(
                choice = this,
                isSelected = allChoices.contains(this),
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

    val choicesView: Flow<List<MixedChoiceView>> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            group.choices.map { choiceOfGroup ->
                when (choiceOfGroup) {
                    is LeveledMainChoice -> {
                        MixedChoiceView.Leveled(choiceOfGroup.makeLeveledChoiceView(allChoices))
                    }

                    is MultibuyMainChoice -> {
                        MixedChoiceView.Multibuy(choiceOfGroup.makeMultibuyChoiceView(allChoices))
                    }

                    is MultiselectMainChoice -> {
                        MixedChoiceView.Multiselect(choiceOfGroup.makeMultiselectChoiceView(allChoices))
                    }

                    is PointTransferMainChoice -> {
                        MixedChoiceView.PointTransfer(choiceOfGroup.makePointTransferChoiceView(allChoices))
                    }

                    else -> {
                        MixedChoiceView.Simple(choiceOfGroup.makeSimpleChoiceView(allChoices))
                    }
                }
            }
        }
    }

    fun onSelected(choice: Choice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice, it)
        }
    }

    fun onLevelSelected(choice: LeveledMainChoice, level: ChoiceLevel) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice.ofLevel(level), it)
        }
    }

    fun onMultibuyChangeAmount(choice: MultibuyMainChoice, newAmount: Int) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice.ofAmount(newAmount), it)
        }
    }

    fun onMultiselectAddChoice(choice: MultiselectMainChoice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            val selectedInstance = it
                .filterIsInstance<MultiselectMainChoice>()
                .singleOrNull { it::class == choice::class }
                ?: choice

            val newSelection = selectedInstance.getPossibleSelections(it).first()
            val alteredInstance = selectedInstance.ofSelections(selectedInstance.selectedChoices + newSelection)
            group.onChoiceSelected(alteredInstance, it)
        }
    }

    fun onMultiselectRemoveChoice(choice: MultiselectMainChoice, toRemove: Choice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            val selectedInstance = it
                .filterIsInstance<MultiselectMainChoice>()
                .singleOrNull { it::class == choice::class }
                ?: choice

            val alteredInstance = selectedInstance.ofSelections(selectedInstance.selectedChoices - toRemove)
            group.onChoiceSelected(alteredInstance, it)
        }
    }

    fun onMultiselectSelectedChoice(choice: MultiselectMainChoice, previousSelection: Choice, newSelection: Choice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            val selectedInstance = it
                .filterIsInstance<MultiselectMainChoice>()
                .singleOrNull { it::class == choice::class }
                ?: choice

            val alteredInstance = selectedInstance.ofSelections(
                selectedInstance.selectedChoices
                    .toMutableList()
                    .apply {
                        this[indexOf(previousSelection)] = newSelection
                    }
                    .toList()
            )
            group.onChoiceSelected(alteredInstance, it)
        }
    }

    fun onPointTransferAmountChanged(choice: PointTransferMainChoice, newAmount: Int) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice.ofAmount(newAmount), it)
        }
    }
}