package com.freakycyoas.supersluts.view

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.freakycyoas.supersluts.viewmodel.MainPageViewModel

@Composable
fun MainPage() {
    val viewModel = remember { MainPageViewModel() }
    val sections by viewModel.sections.collectAsState(emptyList())
    val sectionsItems = sections.map { it.getItems() }.flatten()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //TODO scrollbar hovers over content instead of occupying space (use box not row)
        Row(
            modifier = Modifier.weight(1f).fillMaxWidth(),
        ) {
            val lazyListState = rememberLazyListState()
            LazyColumn(
                state = lazyListState,
                modifier = Modifier.weight(1f).fillMaxHeight(),
                verticalArrangement = Arrangement.spacedBy(32.dp)
            ) {
                items(sectionsItems) { sectionItem ->
                    sectionItem()
                }
            }

            VerticalScrollbar(
                adapter = rememberScrollbarAdapter(lazyListState)
            )
        }

        Box(
            modifier = Modifier.wrapContentHeight().fillMaxWidth()
        ) {
            PointsBar()
        }
    }
}

interface MainPageSection {
    @Composable fun getItems(): List<@Composable () -> Unit>
}

