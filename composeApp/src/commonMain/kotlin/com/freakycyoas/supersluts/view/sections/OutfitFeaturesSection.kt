package com.freakycyoas.supersluts.view.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.outfit_features.OutfitFeaturesChoicesGroup
import com.freakycyoas.supersluts.theme.choiceRowItemWidth
import com.freakycyoas.supersluts.theme.choicesRowSpan
import com.freakycyoas.supersluts.utils.byRow
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.choices.MixedChoicesRow
import com.freakycyoas.supersluts.viewmodel.MixedSectionViewModel

object OutfitFeaturesSection: MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember(OutfitFeaturesChoicesGroup) { MixedSectionViewModel(OutfitFeaturesChoicesGroup) }
        val choices by viewModel.choicesView.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable { SectionHeader("OUTFIT FEATURES", AnnotatedString("That looks good, but it’s a bit too plain. We will need to add some details to make your outfit stand out more. You don’t want to look like a basic bitch, now do you? You can pick as many features as you would like, there is no need to hold back.")) }

        val choicesByRow: List<@Composable () -> Unit> = choices
            .byRow(choicesRowSpan)
            .map { rowChoices ->
                @Composable {
                    //TODO special choices
                    MixedChoicesRow(
                        row = rowChoices,
                        onChoiceSelected = viewModel::onSelected,
                        onLevelSelected = viewModel::onLevelSelected,
                        onMultibuyChangeAmount = viewModel::onMultibuyChangeAmount,
                        onMultiselectAddChoice = viewModel::onMultiselectAddChoice,
                        onMultiselectRemoveChoice = viewModel::onMultiselectRemoveChoice,
                        onMultiselectSelectedChoice = viewModel::onMultiselectSelectedChoice,
                        choiceWidth = choiceRowItemWidth,
                    )
                }
            }

        return listOf(header).plus(choicesByRow)
    }
}