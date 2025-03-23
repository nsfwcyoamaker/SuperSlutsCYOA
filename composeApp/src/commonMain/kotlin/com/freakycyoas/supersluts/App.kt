package com.freakycyoas.supersluts

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.freakycyoas.supersluts.di.global
import com.freakycyoas.supersluts.theme.SurfaceColor
import com.freakycyoas.supersluts.view.MainPage
import org.kodein.di.compose.withDI

@Composable
fun App() {
    withDI(global) {
        MaterialTheme {
            Surface(color = SurfaceColor) {
                MainPage()
            }
        }
    }
}