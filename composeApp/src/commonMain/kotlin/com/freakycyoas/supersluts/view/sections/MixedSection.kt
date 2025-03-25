package com.freakycyoas.supersluts.view.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.model.ChoicesGroup
import com.freakycyoas.supersluts.theme.choiceRowItemWidth
import com.freakycyoas.supersluts.theme.choicesRowSpan
import com.freakycyoas.supersluts.utils.byRow
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.choices.MixedChoicesRow
import com.freakycyoas.supersluts.viewmodel.MixedSectionViewModel

class MixedSection(val title: String, val description: AnnotatedString, val group: ChoicesGroup): MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember(group) { MixedSectionViewModel(group) }
        val choices by viewModel.choicesView.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable { SectionHeader(title, description) }

        val choicesByRow: List<@Composable () -> Unit> = choices
            .byRow(choicesRowSpan)
            .map { rowChoices ->
                @Composable {
                    MixedChoicesRow(
                        row = rowChoices,
                        onChoiceSelected = viewModel::onSelected,
                        onLevelSelected = viewModel::onLevelSelected,
                        onMultibuyChangeAmount = viewModel::onMultibuyChangeAmount,
                        onMultiselectAddChoice = viewModel::onMultiselectAddChoice,
                        onMultiselectRemoveChoice = viewModel::onMultiselectRemoveChoice,
                        onMultiselectSelectedChoice = viewModel::onMultiselectSelectedChoice,
                        onPointTransferAmountChanged = viewModel::onPointTransferAmountChanged,
                        choiceWidth = choiceRowItemWidth,
                    )
                }
            }

        return listOf(header).plus(choicesByRow)
    }
}
