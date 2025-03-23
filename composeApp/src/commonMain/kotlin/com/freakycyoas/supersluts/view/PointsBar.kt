package com.freakycyoas.supersluts.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.freakycyoas.supersluts.di.global
import com.freakycyoas.supersluts.model.fp
import com.freakycyoas.supersluts.model.gp
import com.freakycyoas.supersluts.model.pp
import com.freakycyoas.supersluts.theme.*
import com.freakycyoas.supersluts.viewmodel.MainStateViewModel
import org.kodein.di.instance

@Composable
fun PointsBar() {
    val viewModel: MainStateViewModel by global.instance()

    val pp by viewModel.currentPowerPoints.collectAsState(initial = 0.pp)
    val gp by viewModel.currentGoldPoints.collectAsState(initial = 0.gp)
    val outfitGp by viewModel.currentOutfitGoldPoints.collectAsState(initial = 0.gp)
    val fp by viewModel.currentFatePoints.collectAsState(initial = 0.fp)

    Column(
        modifier = Modifier.fillMaxWidth().wrapContentHeight().background(color = GrayBoxBackgroundColor)
    ) {
        Box(modifier = Modifier.fillMaxWidth().height(2.dp).background(color = BlackBoxBackgroundColor)) {}
        Row(
            modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally)
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(powerPointsStyle) {
                        append("Power Points: ${pp.amount}")
                    }
                }
            )
            Text(
                buildAnnotatedString {
                    withStyle(goldPointsStyle) {
                        append("Gold Points: ${gp.amount}")
                        if(outfitGp != null) {
                            append(" (Outfit: ${outfitGp!!.amount})")
                        }
                    }
                }
            )
            Text(
                buildAnnotatedString {
                    withStyle(fatePointsStyle) {
                        append("Fate Points: ${fp.amount}")
                    }
                }
            )
        }
    }
}