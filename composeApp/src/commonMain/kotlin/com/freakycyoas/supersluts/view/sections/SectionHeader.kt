package com.freakycyoas.supersluts.view.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.freakycyoas.supersluts.theme.RedBoxBackgroundColor
import com.freakycyoas.supersluts.theme.sectionDescriptionStyle
import com.freakycyoas.supersluts.theme.sectionTitleParagraphStyle
import com.freakycyoas.supersluts.theme.sectionTitleSpanStyle

@Composable
fun SectionHeader(
    title: String,
    description: AnnotatedString
) {
    Text(
        buildAnnotatedString {
            withStyle(sectionTitleSpanStyle) {
                withStyle(sectionTitleParagraphStyle) {
                    append(title)
                }
            }
            withStyle(sectionDescriptionStyle) {
                append(description)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .background(color = RedBoxBackgroundColor)
            .padding(start = 20.dp, end = 20.dp, top = 3.dp, bottom = 16.dp),
    )
}