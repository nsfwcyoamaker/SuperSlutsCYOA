package com.freakycyoas.supersluts.view.choices

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.freakycyoas.supersluts.model.*
import com.freakycyoas.supersluts.theme.*
import compose.icons.FeatherIcons
import compose.icons.feathericons.Minus
import compose.icons.feathericons.Plus
import compose.icons.feathericons.Trash2
import org.jetbrains.compose.resources.painterResource

@Composable
fun ChoicesRow(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth().then(modifier),
        horizontalArrangement = Arrangement.spacedBy(choiceRowSpacingWidth, Alignment.CenterHorizontally)
    ) {
        content()
    }
}

@Composable
fun SimpleChoicesRow(
    row: List<ChoiceView>,
    onChoiceSelected: (Choice) -> Unit,
    choiceWidth: Dp = choiceRowItemWidth,
    itemSpacing: Dp = choiceRowSpacingWidth,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.mainChoice }.forEach { choiceState ->
                MainChoiceItem(choiceState, (choiceState.choice as MainChoice).getLinkedDrawbackChoice() != null, { onChoiceSelected(choiceState.choice) }, choiceWidth, modifier = Modifier.fillMaxHeight())
            }
        }
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.drawback }.forEach { choiceState ->
                if(choiceState != null) {
                    DrawbackChoiceItem(choiceState, { onChoiceSelected(choiceState.choice) }, choiceWidth, modifier = Modifier.fillMaxHeight())
                } else {
                    Box(modifier = Modifier.requiredWidth(choiceWidth).fillMaxHeight())
                }
            }
        }
    }
}

@Composable
private fun MainChoiceItem(
    choiceState: ChoiceState,
    hasDrawback: Boolean,
    onSelected: () -> Unit,
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .then(
                if(!hasDrawback) {
                    modifier.clip(BottomRightCornerCutShape)
                } else {
                    Modifier
                }
            )
            .then(
                if(choiceState.isEnabled) {
                    Modifier.alpha(1f).clickable(onClick = onSelected)
                } else {
                    Modifier.alpha(0.6f)
                }
            )
            .drawWithContent {
                drawContent()
                if(choiceState.isSelected) {
                    drawRect(selectedChoiceOverlayColor)
                }
            }
    ) {
        Image(
            painter = painterResource(choiceState.choice.image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .requiredWidth(width)
                .aspectRatio(1f, false)
                .background(Color.Black),
        )

        Box(modifier = Modifier.requiredWidth(width).height(4.dp).background(color = RedBoxBackgroundColor)) {}
        Column(modifier = Modifier.requiredWidth(width).weight(1f).background(color = BlackBoxBackgroundColor).padding(
            choiceTextPadding
        )) {
            Text(
                buildAnnotatedString {
                    withStyle(choiceTitleParagraphStyle) {
                        withStyle(choiceTitleSpanStyle) {
                            append(choiceState.choice.name)
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                choiceState.choice.description,
                modifier = Modifier.fillMaxWidth()
            )
            Box(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
private fun DrawbackChoiceItem(
    choiceState: ChoiceState,
    onSelected: () -> Unit,
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(BottomRightCornerCutShape)
            .then(
                if(choiceState.isEnabled) {
                    Modifier.alpha(1f).clickable(onClick = onSelected)
                } else {
                    Modifier.alpha(0.6f)
                }
            )
            .drawWithContent {
                drawContent()
                if(choiceState.isSelected) {
                    drawRect(selectedChoiceOverlayColor)
                }
            }
    ) {
        Column(modifier = Modifier.requiredWidth(width).weight(1f).background(color = GrayBoxBackgroundColor)) {
            Column(
                modifier = Modifier.padding(choiceTextPadding)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleParagraphStyle) {
                            withStyle(choiceTitleSpanStyle) {
                                append(choiceState.choice.name)
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    choiceState.choice.description,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Box(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(choiceState.choice.image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .requiredWidth(width)
                    .aspectRatio(1f, false),
            )
        }
    }
}

@Composable
fun SpannableDrawbacksChoicesRow(
    row: List<ChoiceView>,
    onChoiceSelected: (Choice) -> Unit,
    choiceWidth: Dp = choiceRowItemWidth,
    itemSpacing: Dp = choiceRowSpacingWidth,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.mainChoice }.forEach { choiceState ->
                MainChoiceItem(choiceState, (choiceState.choice as MainChoice).getLinkedDrawbackChoice() != null, { onChoiceSelected(choiceState.choice) }, choiceWidth, modifier = Modifier.fillMaxHeight())
            }
        }
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.drawback }.groupBy { choiceState -> (choiceState?.choice as? DrawbackChoice)?.let { it::class } }
                .values
                .map { it.toSet().single() to it.size }
                .forEach { (choiceState, span) ->
                    if(choiceState != null) {
                        SpannedDrawbackChoiceItem(choiceState, { onChoiceSelected(choiceState.choice) }, span, choiceWidth, itemSpacing, modifier = Modifier.fillMaxHeight())
                    } else {
                        Box(modifier = Modifier.requiredWidth(choiceWidth).fillMaxHeight())
                    }
                }
        }
    }
}

@Composable
fun SpannedDrawbackChoiceItem(
    choiceState: ChoiceState,
    onSelected: () -> Unit,
    span: Int,
    itemSize: Dp,
    itemSpacing: Dp,
    modifier: Modifier = Modifier,
) {
    val totalWidth = (itemSize * span) + (itemSpacing * (span-1))

    Column(
        modifier = modifier
            .clip(BottomRightCornerCutShape)
            .then(
                if(choiceState.isEnabled) {
                    Modifier.alpha(1f).clickable(onClick = onSelected)
                } else {
                    Modifier.alpha(0.6f)
                }
            )
            .drawWithContent {
                drawContent()
                if(choiceState.isSelected) {
                    drawRect(selectedChoiceOverlayColor)
                }
            }
    ) {
        Column(
            modifier = Modifier.requiredWidth(totalWidth).weight(1f).background(color = GrayBoxBackgroundColor),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.padding(choiceTextPadding)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleParagraphStyle) {
                            withStyle(choiceTitleSpanStyle) {
                                append(choiceState.choice.name)
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    choiceState.choice.description,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Box(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(choiceState.choice.image),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.height(itemSize).wrapContentWidth(),
            )
        }
    }
}

@Composable
fun LeveledChoicesRow(
    row: List<LeveledChoiceView>,
    onLevelSelected: (LeveledMainChoice, ChoiceLevel) -> Unit,
    onDrawbackSelected: (DrawbackChoice) -> Unit,
    choiceWidth: Dp = choiceRowItemWidth,
    itemSpacing: Dp = choiceRowSpacingWidth,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.mainChoice }.forEach { choiceState ->
                LeveledMainChoiceItem(choiceState, choiceState.choice.getLinkedDrawbackChoice() != null, { onLevelSelected(choiceState.choice, it) }, choiceWidth, modifier = Modifier.fillMaxHeight())
            }
        }
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.map { it.drawback }.forEach { choiceState ->
                if(choiceState != null) {
                    DrawbackChoiceItem(choiceState, { onDrawbackSelected(choiceState.choice as DrawbackChoice) }, choiceWidth, modifier = Modifier.fillMaxHeight())
                } else {
                    Box(modifier = Modifier.requiredWidth(choiceWidth).fillMaxHeight())
                }
            }
        }
    }
}

@Composable
fun LeveledMainChoiceItem(
    choiceState: LeveledChoiceState,
    hasDrawback: Boolean,
    onLevelSelected: (ChoiceLevel) -> Unit,
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .then(
                if(!hasDrawback) {
                    modifier.clip(BottomRightCornerCutShape)
                } else {
                    Modifier
                }
            )
            .then(
                if(choiceState.isEnabled) {
                    Modifier.alpha(1f)
                } else {
                    Modifier.alpha(0.6f)
                }
            )
    ) {
        Image(
            painter = painterResource(choiceState.choice.image),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .requiredWidth(width)
                .aspectRatio(1f, false)
                .background(Color.Black),
        )
        Box(modifier = Modifier.requiredWidth(width).height(4.dp).background(color = RedBoxBackgroundColor)) {}
        Column(modifier = Modifier.requiredWidth(width).weight(1f).background(color = BlackBoxBackgroundColor).padding(
            choiceTextPadding
        )) {
            Text(
                buildAnnotatedString {
                    withStyle(choiceTitleParagraphStyle) {
                        withStyle(choiceTitleSpanStyle) {
                            append(choiceState.choice.name)
                        }
                    }
                    append(choiceState.choice.description)
                },
                modifier = Modifier.fillMaxWidth()
            )
            Box(modifier = Modifier.height(8.dp))
            choiceState.choice.levels.forEach { level ->
                Text(
                    buildAnnotatedString {
                        withStyle(choiceSubtitleSpanStyle) {
                            append("Level ${level.number}")

                            if(level.powerPoints != null || level.goldPoints != null || level.outfitGoldPoints != null || level.fatePoints != null) {
                                append("(")
                                level.powerPoints?.let { powerPoints ->
                                    withStyle(powerPointsStyle) {
                                        append(powerPoints.amount.toString())
                                    }
                                }

                                if(level.powerPoints != null && (level.goldPoints != null || level.outfitGoldPoints != null || level.fatePoints != null)) {
                                    append(", ")
                                }

                                (level.goldPoints ?: level.outfitGoldPoints)?.let { goldPoints ->
                                    withStyle(goldPointsStyle) {
                                        append(goldPoints.amount.toString())
                                    }
                                }

                                if((level.powerPoints != null || level.goldPoints != null || level.outfitGoldPoints != null) && level.fatePoints != null) {
                                    append(", ")
                                }

                                level.fatePoints?.let { fatePoints ->
                                    withStyle(fatePointsStyle) {
                                        append(fatePoints.amount.toString())
                                    }
                                }
                                append(")")
                            }
                        }
                        append("\n")
                        withStyle(choiceDescriptionStyle) {
                            append(level.description)
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .clickable { onLevelSelected(level) }
                        .drawWithContent {
                            drawContent()
                            if(choiceState.selectedLevel == level.number) {
                                drawRect(selectedChoiceOverlayColor)
                            }
                        }
                        .padding(12.dp)
                )
            }

            Box(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun SlottedLeveledChoicesRow(
    row: List<LeveledChoiceState>,
    onSlotUpdated: (LeveledMainChoice, ChoiceLevel) -> Unit,
    onSlotRemoved: (LeveledMainChoice) -> Unit,
    onSlotAdded: () -> Unit,
    choiceWidth: Dp = choiceRowItemWidth,
    itemSpacing: Dp = choiceRowSpacingWidth,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max).requiredWidth((choiceWidth * 3) + (itemSpacing * 2)),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.End),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if(row.size < choicesRowSpan) {
                Box(
                    modifier = Modifier.fillMaxHeight().requiredWidth(choiceWidth),
                    contentAlignment = Alignment.Center,
                ) {
                    Icons.Default.Add
                    Icon(Icons.Default.Add, null, tint = BlackBoxTitleTextColor,  modifier = Modifier.size(48.dp).clip(CircleShape).background(color = BlackBoxBackgroundColor).clickable(onClick = onSlotAdded))
                }
            }

            row.reversed().forEach { choiceState ->
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    LeveledMainChoiceItem(
                        choiceState = choiceState,
                        hasDrawback = false,
                        onLevelSelected = { level -> onSlotUpdated(choiceState.choice, level) },
                        width = choiceWidth,
                        modifier = Modifier.weight(1f)
                    )

                    Box(
                        modifier = Modifier.wrapContentHeight().requiredWidth(choiceWidth),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(Icons.Default.Delete, null, tint = BlackBoxTitleTextColor,  modifier = Modifier.size(48.dp).clip(CircleShape).background(color = BlackBoxBackgroundColor).clickable { onSlotRemoved(choiceState.choice) })
                    }
                }
            }
        }
    }
}

@Composable
fun MultibuyMainChoiceItem(
    choiceState: MultibuyChoiceState,
    hasDrawback: Boolean,
    onChangeAmount: (Int) -> Unit,
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .then(
                if(!hasDrawback) {
                    modifier.clip(BottomRightCornerCutShape)
                } else {
                    Modifier
                }
            )
            .then(
                if(choiceState.isEnabled) {
                    Modifier.alpha(1f)
                } else {
                    Modifier.alpha(0.6f)
                }
            )
    ) {
        Column(
            modifier = Modifier
                .drawWithContent {
                    drawContent()
                    if(choiceState.boughtTimes > 0) {
                        drawRect(selectedChoiceOverlayColor)
                    }
                }
        ) {
            Image(
                painter = painterResource(choiceState.choice.image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .requiredWidth(width)
                    .aspectRatio(1f, false)
                    .background(Color.Black),
            )
            Box(modifier = Modifier.requiredWidth(width).height(4.dp).background(color = RedBoxBackgroundColor))
            Column(
                modifier = Modifier
                    .requiredWidth(width)
                    .background(color = BlackBoxBackgroundColor)
                    .padding(choiceTextPadding)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleParagraphStyle) {
                            withStyle(choiceTitleSpanStyle) {
                                append(choiceState.choice.name)
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    choiceState.choice.description,
                    modifier = Modifier.fillMaxWidth()
                )

                Box(modifier = Modifier.height(8.dp))
            }
        }

        Column(
            modifier = Modifier
                .requiredWidth(width)
                .background(color = BlackBoxBackgroundColor)
                .drawWithContent {
                    if(choiceState.boughtTimes > 0) {
                        drawRect(selectedChoiceOverlayColor)
                    }
                    drawContent()
                }
                .padding(choiceTextPadding),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(
                    enabled = choiceState.boughtTimes >= 1,
                    onClick = {
                        onChangeAmount(choiceState.boughtTimes - 1)
                    },
                    modifier = if(choiceState.boughtTimes >= 1) {
                        Modifier
                    } else {
                        Modifier.alpha(0.3f)
                    }
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(color = BlackBoxTitleTextColor),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = FeatherIcons.Minus,
                            contentDescription = null,
                            tint = BlackBoxBackgroundColor,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleParagraphStyle) {
                            withStyle(choiceTitleSpanStyle) {
                                append(choiceState.boughtTimes.toString())
                            }
                        }
                    },
                )
                IconButton(
                    onClick = {
                        onChangeAmount(choiceState.boughtTimes + 1)
                    },
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(color = BlackBoxTitleTextColor),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = FeatherIcons.Plus,
                            contentDescription = null,
                            tint = BlackBoxBackgroundColor,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            }

            Box(modifier = Modifier.weight(1f))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MultiselectDropdownBox(
    currentSelection: Choice,
    possibleSelections: List<Choice>,
    onSelect: (Choice) -> Unit,
    modifier: Modifier = Modifier,
) {
    var expanded by remember { mutableStateOf(false) }
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { newValue ->
            expanded = newValue
        }
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clip(BottomRightCornerCutShape)
                .border(width = 2.dp, color = BlackBoxTitleTextColor, shape = BottomRightCornerCutShape)
                .background(color = BlackBoxBackgroundColor)
                .padding(vertical = 2.dp)
                .padding(start = 4.dp, end = 8.dp)
                .menuAnchor()
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(choiceTitleSpanStyle) {
                        append(currentSelection.name)
                    }
                },
                textAlign = TextAlign.Start,
                modifier = Modifier.fillMaxWidth(),
            )
        }
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.background(BlackBoxBackgroundColor),
        ) {
            possibleSelections.forEach { possibleSelection ->
                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleSpanStyle) {
                            append(possibleSelection.name)
                        }
                    },
                    modifier = Modifier
                        .clickable {
                            onSelect(possibleSelection)
                            expanded = false
                        }
                )
            }
        }
    }
}

@Composable
fun MultiselectMainChoiceItem(
    choiceState: MultiselectChoiceState,
    hasDrawback: Boolean,
    onMultiselectAddChoice: () -> Unit,
    onMultiselectRemoveChoice: (Choice) -> Unit,
    onMultiselectSelectedChoice: (Choice, Choice) -> Unit,
    width: Dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .then(
                if(!hasDrawback) {
                    modifier.clip(BottomRightCornerCutShape)
                } else {
                    Modifier
                }
            )
            .then(
                if(choiceState.isEnabled) {
                    Modifier.alpha(1f)
                } else {
                    Modifier.alpha(0.6f)
                }
            )
    ) {
        Column(
            modifier = Modifier
                .drawWithContent {
                    drawContent()
                    if(choiceState.selectedChoices.isNotEmpty()) {
                        drawRect(selectedChoiceOverlayColor)
                    }
                }
        ) {
            Image(
                painter = painterResource(choiceState.choice.image),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .requiredWidth(width)
                    .aspectRatio(1f, false)
                    .background(Color.Black),
            )
            Box(modifier = Modifier.requiredWidth(width).height(4.dp).background(color = RedBoxBackgroundColor)) {}
            Column(
                modifier = Modifier
                    .requiredWidth(width)
                    .background(color = BlackBoxBackgroundColor)
                    .padding(choiceTextPadding)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(choiceTitleParagraphStyle) {
                            withStyle(choiceTitleSpanStyle) {
                                append(choiceState.choice.name)
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    choiceState.choice.description,
                    modifier = Modifier.fillMaxWidth()
                )

                Box(modifier = Modifier.height(8.dp))
            }
        }

        Column(
            modifier = Modifier
                .requiredWidth(width)
                .background(color = BlackBoxBackgroundColor)
                .drawWithContent {
                    if(choiceState.selectedChoices.isNotEmpty()) {
                        drawRect(selectedChoiceOverlayColor)
                    }
                    drawContent()
                }
                .padding(choiceTextPadding),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            choiceState.selectedChoices.forEach { selectedChoice ->
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                ) {
                    IconButton(
                        onClick = { onMultiselectRemoveChoice(selectedChoice) },
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(color = BlackBoxTitleTextColor),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = FeatherIcons.Trash2,
                                contentDescription = null,
                                tint = BlackBoxBackgroundColor,
                                modifier = Modifier.size(28.dp)
                            )
                        }
                    }

                    MultiselectDropdownBox(
                        currentSelection = selectedChoice,
                        possibleSelections = choiceState.selectableChoices,
                        onSelect = { onMultiselectSelectedChoice(selectedChoice, it) },
                    )
                }
            }

            if(choiceState.selectableChoices.isNotEmpty()) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    IconButton(
                        onClick = onMultiselectAddChoice,
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(color = BlackBoxTitleTextColor),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                imageVector = FeatherIcons.Plus,
                                contentDescription = null,
                                tint = BlackBoxBackgroundColor,
                                modifier = Modifier.size(28.dp)
                            )
                        }
                    }
                }
            }

            Box(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun MixedChoicesRow(
    row: List<MixedChoiceView>,
    onChoiceSelected: (Choice) -> Unit,
    onLevelSelected: (LeveledMainChoice, ChoiceLevel) -> Unit,
    onMultibuyChangeAmount: (choice: MultibuyMainChoice, newAmount: Int) -> Unit,
    onMultiselectAddChoice: (MultiselectMainChoice) -> Unit,
    onMultiselectRemoveChoice: (MultiselectMainChoice, Choice) -> Unit,
    onMultiselectSelectedChoice: (MultiselectMainChoice, Choice, Choice) -> Unit,
    choiceWidth: Dp = choiceRowItemWidth,
    itemSpacing: Dp = choiceRowSpacingWidth,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.forEach { mixedChoice ->
                when(mixedChoice) {
                    is MixedChoiceView.Simple -> {
                        val choiceState = mixedChoice.choiceView.mainChoice
                        MainChoiceItem(
                            choiceState = choiceState,
                            hasDrawback = (choiceState.choice as MainChoice).getLinkedDrawbackChoice() != null,
                            onSelected = { onChoiceSelected(choiceState.choice) },
                            width = choiceWidth,
                            modifier = Modifier.fillMaxHeight()
                        )
                    }

                    is MixedChoiceView.Multibuy -> {
                        val choiceState = mixedChoice.multibuyChoiceView.mainChoice
                        MultibuyMainChoiceItem(
                            choiceState = choiceState,
                            hasDrawback = choiceState.choice.getLinkedDrawbackChoice() != null,
                            onChangeAmount = { onMultibuyChangeAmount(choiceState.choice, it) },
                            width = choiceWidth,
                            modifier = Modifier.fillMaxHeight()
                        )
                    }

                    is MixedChoiceView.Multiselect -> {
                        val choiceState = mixedChoice.multiselectChoiceView.mainChoice
                        MultiselectMainChoiceItem(
                            choiceState = choiceState,
                            hasDrawback = choiceState.choice.getLinkedDrawbackChoice() != null,
                            onMultiselectAddChoice = { onMultiselectAddChoice(choiceState.choice) },
                            onMultiselectRemoveChoice = { onMultiselectRemoveChoice(choiceState.choice, it) },
                            onMultiselectSelectedChoice = { remove, add -> onMultiselectSelectedChoice(choiceState.choice, remove, add) },
                            width = choiceWidth,
                            modifier = Modifier.fillMaxHeight(),
                        )
                    }

                    is MixedChoiceView.Leveled -> {
                        val choiceState = mixedChoice.leveledChoiceView.mainChoice
                        LeveledMainChoiceItem(
                            choiceState = choiceState,
                            hasDrawback = choiceState.choice.getLinkedDrawbackChoice() != null,
                            onLevelSelected = { onLevelSelected(choiceState.choice, it) },
                            width = choiceWidth,
                            modifier = Modifier.fillMaxHeight()
                        )
                    }
                }
            }
        }
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.spacedBy(itemSpacing, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            row.forEach { mixedChoice ->
                val choiceState = when(mixedChoice) {
                    is MixedChoiceView.Simple -> {
                        mixedChoice.choiceView.drawback
                    }
                    is MixedChoiceView.Multibuy -> {
                        mixedChoice.multibuyChoiceView.drawback
                    }
                    is MixedChoiceView.Multiselect -> {
                        mixedChoice.multiselectChoiceView.drawback
                    }
                    is MixedChoiceView.Leveled -> {
                        mixedChoice.leveledChoiceView.drawback
                    }
                }

                if(choiceState != null) {
                    DrawbackChoiceItem(choiceState, { onChoiceSelected(choiceState.choice) }, choiceWidth, modifier = Modifier.fillMaxHeight())
                } else {
                    Box(modifier = Modifier.requiredWidth(choiceWidth).fillMaxHeight())
                }
            }
        }
    }
}