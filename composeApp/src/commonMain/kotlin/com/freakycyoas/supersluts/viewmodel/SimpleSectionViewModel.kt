package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.di.global
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.ChoiceState
import com.freakycyoas.supersluts.model.ChoiceView
import com.freakycyoas.supersluts.model.ChoicesGroup
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

open class SimpleSectionViewModel(private val group: ChoicesGroup) {
    protected val mainStateViewModel: MainStateViewModel by global.instance()

    val choicesView: Flow<List<ChoiceView>> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            group.choices.map { choiceOfGroup ->
                ChoiceView(
                    mainChoice = ChoiceState(
                        choice = choiceOfGroup,
                        isSelected = allChoices.contains(choiceOfGroup),
                        isEnabled = choiceOfGroup.canBeTaken(allChoices),
                    ),
                    drawback = choiceOfGroup.getLinkedDrawbackChoice()?.let { drawback ->
                        ChoiceState(
                            choice = drawback,
                            isSelected = allChoices.contains(drawback),
                            isEnabled = drawback.canBeTaken(allChoices),
                        )
                    }
                )
            }
        }
    }

    fun onSelected(choice: Choice) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            group.onChoiceSelected(choice, it)
        }
    }
}