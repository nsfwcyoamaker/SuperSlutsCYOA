package com.freakycyoas.supersluts.view.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.freakycyoas.supersluts.data.gender.Gender
import com.freakycyoas.supersluts.theme.*
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.choices.ChoicesRow
import com.freakycyoas.supersluts.view.choices.SimpleChoicesRow
import com.freakycyoas.supersluts.viewmodel.GenderSectionViewModel

object GenderSection: MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        val viewModel = remember { GenderSectionViewModel() }
        val playerGender by viewModel.playerGender.collectAsState(Gender.MALE)
        val choices by viewModel.choicesView.collectAsState(emptyList())

        val header: @Composable () -> Unit = @Composable {
            SectionHeader(
                "GENDER",
                buildAnnotatedString {
                    append("Wait! I feel like I am forgetting something very important. Hmm, the most important thing about heroes is not their superpowers… no, it's their looks! Yes! I have never seen an ugly superhero! Who would want to get saved by a total uggo anyways? Not me, that's for sure. So let's get you a total makeover first. So what gender do you want to be? Like you don't have to be the gender you were born with, actually, I prefer you didn't, it really doesn't suit you you know. On second thought, this makeover is like reeeeally delicate and it will like influence your superpowers. Yes, you get like ")
                    withStyle(powerPointsStyle) { append("Power Points") }
                    append(" for choosing how your new body will look like. Some options will grant you more ")
                    withStyle(powerPointsStyle) { append("Power Points") }
                    append(" than others and then you will spend your ")
                    withStyle(powerPointsStyle) { append("Power Points") }
                    append(" to purchase superpowers. Yes, that is totally how this works and it's not something I just made up! I also don't want your new body to get all wrinkly and old so I'Il grant you eternal youth. Like it would be such a waste for me to make you look beautiful and then after a couple of years you would just get ugly again. I almost forgot something else, t is super important for a superhero to have weaknesses and flaws. So most options will have 1 connected drawback. While the drawbacks are totally optional, they will grant you Ir Points if you take them. You can take drawbacks that are not connected to the options you choose. But if you do take a drawback that is connected to an option you have chosen you will gain ")
                    withStyle(powerPointsStyle) { append("3") }
                    append(" additional ")
                    withStyle(powerPointsStyle) { append("Power Points") }
                    append(". Some options and drawbacks also have requirements which you must obey in order to pick them.")
                }
            )
        }

        val originalGenderRow: @Composable () -> Unit = @Composable {
            ChoicesRow {
                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleParagraphStyle) {
                            withStyle(choiceTitleSpanStyle) {
                                append("I AM FEMALE")
                            }
                        }
                    },
                    modifier = Modifier
                        .width(choiceRowItemWidth)
                        .clip(BottomRightCornerCutShape)
                        .background(color = BlackBoxBackgroundColor)
                        .drawWithContent {
                            drawContent()
                            if(playerGender == Gender.FEMALE) {
                                drawRect(selectedChoiceOverlayColor)
                            }
                        }
                        .clickable { viewModel.setGender(Gender.FEMALE) }
                        .padding(choiceTextPadding),
                )

                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleParagraphStyle) {
                            withStyle(choiceTitleSpanStyle) {
                                append("I AM MALE")
                            }
                        }
                    },
                    modifier = Modifier
                        .width(choiceRowItemWidth)
                        .clip(BottomRightCornerCutShape)
                        .background(color = BlackBoxBackgroundColor)
                        .drawWithContent {
                            drawContent()
                            if(playerGender == Gender.MALE) {
                                drawRect(selectedChoiceOverlayColor)
                            }
                        }
                        .clickable { viewModel.setGender(Gender.MALE) }
                        .padding(choiceTextPadding),
                )
            }
        }

        val choicesRow: @Composable () -> Unit = @Composable {
            SimpleChoicesRow(
                row = choices,
                onChoiceSelected = viewModel::onSelected,
                choiceWidth = choiceRowItemWidth,
            )
        }

        return listOf(header, originalGenderRow, choicesRow)
    }
}