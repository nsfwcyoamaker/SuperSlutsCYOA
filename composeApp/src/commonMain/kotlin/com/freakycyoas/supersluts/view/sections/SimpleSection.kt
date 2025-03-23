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
import com.freakycyoas.supersluts.view.choices.SimpleChoicesRow
import com.freakycyoas.supersluts.viewmodel.SimpleSectionViewModel

class SimpleSection(val title: String, val description: AnnotatedString, val group: ChoicesGroup): MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember(group) { SimpleSectionViewModel(group) }
        val choices by viewModel.choicesView.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable { SectionHeader(title, description) }

        val choicesByRow: List<@Composable () -> Unit> = choices
            .byRow(choicesRowSpan)
            .map { rowChoices ->
                @Composable {
                    SimpleChoicesRow(
                        row = rowChoices,
                        onChoiceSelected = viewModel::onSelected,
                        choiceWidth = choiceRowItemWidth,
                    )
                }
            }

        return listOf(header).plus(choicesByRow)
    }
}
