package com.freakycyoas.supersluts.view.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.powers.PowersNaturalWeapon
import com.freakycyoas.supersluts.model.LeveledChoiceState
import com.freakycyoas.supersluts.model.LeveledChoiceView
import com.freakycyoas.supersluts.theme.choiceRowItemWidth
import com.freakycyoas.supersluts.theme.choicesRowSpan
import com.freakycyoas.supersluts.utils.byRow
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.choices.LeveledChoicesRow
import com.freakycyoas.supersluts.view.choices.SlottedLeveledChoicesRow
import com.freakycyoas.supersluts.viewmodel.PowersSectionViewModel

object PowersSection: MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember { PowersSectionViewModel() }
        val choices by viewModel.powers.collectAsState(emptyList())
        val naturalWeaponSlots by viewModel.additionalNaturalWeapons.collectAsState(null)

        val header: @Composable () -> Unit = @Composable { SectionHeader("POWERS", AnnotatedString("And that’s that! Ohhh right, you’re supposed to choose your powers too. Damn this is taking forever... Ok, each power has 3 levels, you only need to pay for the highest level you want to purchase. So you don’t have to buy all of the previous levels in order to buy a level 3 power. All of the benefits and abilities in lower levels are included in the higher levels of a power, if it makes sense. Now hurry up and choose already, I want to design your superhero costume!")) }

        fun List<LeveledChoiceView>.makeRowComposable(): @Composable () -> Unit {
            val composable = @Composable {
                LeveledChoicesRow(
                    row = this,
                    onLevelSelected = viewModel::onLevelSelected,
                    onDrawbackSelected = viewModel::onDrawbackSelected,
                    choiceWidth = choiceRowItemWidth,
                )
            }
            return composable
        }

        val rows: List<@Composable () -> Unit> = choices
            .indexOfFirst { it.mainChoice.choice::class == PowersNaturalWeapon::class }
            .let { it + 1 }
            .let { indexOfNaturalWeapon ->
                choices.subList(0, indexOfNaturalWeapon) to choices.subList(indexOfNaturalWeapon, choices.size)
            }
            .let { (preNaturalWeapon, postNaturalWeapon) ->
                var needsEmptyTrailingRow = false
                fun makeEmptyTrailingRow(): @Composable () -> Unit {
                    val row: @Composable () -> Unit = @Composable {
                        SlottedLeveledChoicesRow(
                            row = emptyList(),
                            onSlotUpdated = viewModel::onSlotUpdated,
                            onSlotRemoved = viewModel::removeAdditionalWeaponSlot,
                            onSlotAdded = viewModel::makeNewAdditionalWeaponSlot,
                            choiceWidth = choiceRowItemWidth,
                        )
                    }

                    return row
                }

                val slots: List<@Composable () -> Unit>? = naturalWeaponSlots
                    ?.byRow(choicesRowSpan)
                    ?.also { needsEmptyTrailingRow = it.isEmpty() || it.last().size == choicesRowSpan }
                    ?.map<List<LeveledChoiceState>, @Composable () -> Unit> { slots ->
                        @Composable {
                            SlottedLeveledChoicesRow(
                                row = slots,
                                onSlotUpdated = viewModel::onSlotUpdated,
                                onSlotRemoved = viewModel::removeAdditionalWeaponSlot,
                                onSlotAdded = viewModel::makeNewAdditionalWeaponSlot,
                                choiceWidth = choiceRowItemWidth,
                            )
                        }
                    }
                    ?.let {
                        if(needsEmptyTrailingRow) {
                            it + makeEmptyTrailingRow()
                        } else {
                            it
                        }
                    }

                preNaturalWeapon.byRow(choicesRowSpan).map { it.makeRowComposable() } +
                (slots ?: emptyList()) +
                postNaturalWeapon.byRow(choicesRowSpan).map { it.makeRowComposable() }
            }

        return listOf(header).plus(rows)
    }
}
