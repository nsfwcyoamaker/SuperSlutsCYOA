package com.freakycyoas.supersluts.view.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.theme.choiceRowItemWidth
import com.freakycyoas.supersluts.theme.choicesRowSpan
import com.freakycyoas.supersluts.theme.goldPointsStyle
import com.freakycyoas.supersluts.utils.byRow
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.choices.LeveledChoicesRow
import com.freakycyoas.supersluts.view.choices.MixedChoicesRow
import com.freakycyoas.supersluts.viewmodel.PerksSectionViewModel

object PerksSection: MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember { PerksSectionViewModel() }
        val choices by viewModel.choicesView.collectAsState(emptyList())
        val geneticModificationPowers by viewModel.geneticModificationPowers.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable {
            SectionHeader(
                "PERKS",
                buildAnnotatedString {
                    append("Now on to the perks! Let's see what goodies you can buy with all those ")
                    withStyle(goldPointsStyle) { append("Gold Points") }
                    append(" you have gathered! There are a lot of things you might want to get as a superhero. If you have the ")
                    withStyle(goldPointsStyle) { append("Gold Points") }
                    append(" for it that is.")
                }
            )
        }

        val choicesByRow = choices
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

        val geneticModifications = geneticModificationPowers
            .byRow(choicesRowSpan)
            .map { rowChoices ->
                @Composable {
                    LeveledChoicesRow(
                        row = rowChoices,
                        onLevelSelected = viewModel::onGeneticModificationPowerLevelSelected,
                        onDrawbackSelected = {},
                        choiceWidth = choiceRowItemWidth,
                    )
                }
            }

        return listOf(header).plus(choicesByRow).plus(geneticModifications)
    }
}