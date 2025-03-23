package com.freakycyoas.supersluts.di

import com.freakycyoas.supersluts.viewmodel.MainStateViewModel
import org.kodein.di.DI
import org.kodein.di.bindSingleton

val global = DI {
    bindSingleton { MainStateViewModel() }
}