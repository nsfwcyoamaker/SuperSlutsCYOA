package com.freakycyoas.supersluts.view.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.*
import com.freakycyoas.supersluts.utils.byRow
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.choices.ChoicesRow
import com.freakycyoas.supersluts.view.choices.SimpleChoicesRow
import com.freakycyoas.supersluts.viewmodel.SponsorSectionViewModel

object SponsorSection: MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember { SponsorSectionViewModel() }
        val exchangedPoints by viewModel.exchangedPowerPoints.collectAsState(0.pp to 0.gp)
        val choices by viewModel.choicesView.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable {
            SectionHeader(
                "SPONSOR",
                buildAnnotatedString {
                    append("I won’t send you back to your original universe. How lame would that be? No, I will drop you off in a brand new universe where superheroes and supervillains exist. This new universe is pretty much like your old universe, but with superpowers, it even got the same countries. Don’t freak out, I won’t just drop you off like some unwanted baby at an orphanage. I’ll make sure to set you up properly before I send you off. The Superhero business is a lot more corporatized in this world than in your world’s comics. So in order to afford your superhero license, you will need a sponsor. Well, you don’t need to choose a sponsor, if you don’t want to be the \"property\" of a billion-dollar corporation. You may only choose 1 sponsor. If you have any ")
                    withStyle(powerPointsStyle) { append("Power Points") }
                    append(" left you can convert them into ")
                    withStyle(goldPointsStyle) { append("Gold Points") }
                    append(", at a rate of ")
                    withStyle(powerPointsStyle) { append("2 Power Points") }
                    append(" to ")
                    withStyle(goldPointsStyle) { append("1 Gold Point") }
                    append(". ")
                    withStyle(goldPointsStyle) { append("Gold Points") }
                    append(" will be used from now on as a token currency to improve your new life.")
                }
            )
        }

        val pointConversion: @Composable () -> Unit = @Composable {
            ChoicesRow {
                Row(
                    modifier = Modifier
                        .clip(BottomRightCornerCutShape)
                        .background(color = BlackBoxBackgroundColor)
                        .padding(choiceTextPadding),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        buildAnnotatedString {
                            withStyle(choiceTitleSpanStyle) {
                                withStyle(powerPointsStyle) {
                                    append("Power Points: ")
                                }
                            }
                        },
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Icon(
                            Icons.Default.KeyboardArrowUp,
                            null,
                            tint = Color.White,
                            modifier = Modifier.clickable(onClick = viewModel::incrementPowerPointsExchanged)
                        )
                        Text(
                            buildAnnotatedString {
                                withStyle(choiceTitleSpanStyle) {
                                    withStyle(powerPointsStyle) {
                                        append("${exchangedPoints.first.amount}")
                                    }
                                }
                            },
                        )
                        Icon(
                            Icons.Default.KeyboardArrowDown,
                            null,
                            tint = Color.White,
                            modifier = Modifier.clickable(onClick = viewModel::decrementPowerPointsExchanged)
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(Icons.Default.ArrowForward, null, tint = Color.White)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        buildAnnotatedString {
                            withStyle(choiceTitleSpanStyle) {
                                withStyle(goldPointsStyle) {
                                    append("${exchangedPoints.second.amount} Gold Points")
                                }
                            }
                        },
                    )
                }
            }
        }

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

        return listOf(header, pointConversion).plus(choicesByRow)
    }
}