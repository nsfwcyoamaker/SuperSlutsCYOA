package com.freakycyoas.supersluts.view.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.freakycyoas.supersluts.theme.RedBoxBackgroundColor
import com.freakycyoas.supersluts.theme.RedBoxTextColor
import com.freakycyoas.supersluts.view.MainPageSection

class ExplanationSection(val text: AnnotatedString): MainPageSection {
    @Composable
    override fun getItems(): List<@Composable () -> Unit> {
        return listOf @Composable {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = RedBoxBackgroundColor)
                        .padding(8.dp),
                    color = RedBoxTextColor,
                    fontSize = 16.sp,
                )
            }
        }
    }
}