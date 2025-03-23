package com.freakycyoas.supersluts.view.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.theme.choiceRowItemWidth
import com.freakycyoas.supersluts.theme.choicesRowSpan
import com.freakycyoas.supersluts.utils.byRow
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.choices.LeveledChoicesRow
import com.freakycyoas.supersluts.viewmodel.MinionPowersSectionViewModel

class MinionPowersSection(val summonMinionPowerLevel: Int): MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember(summonMinionPowerLevel) { MinionPowersSectionViewModel(summonMinionPowerLevel) }
        val choices by viewModel.choicesView.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable { SectionHeader("MINION POWERS", AnnotatedString("")) }

        val choicesByRow: List<@Composable () -> Unit> = choices
            .byRow(choicesRowSpan)
            .map { rowChoices ->
                @Composable {
                    LeveledChoicesRow(
                        row = rowChoices,
                        onLevelSelected = viewModel::onLevelSelected,
                        onDrawbackSelected = {},
                        choiceWidth = choiceRowItemWidth,
                    )
                }
            }

        return listOf(header).plus(choicesByRow)
    }
}