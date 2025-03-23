package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.gender.Gender
import com.freakycyoas.supersluts.data.gender.GenderChoicesGroup
import com.freakycyoas.supersluts.data.gender.OriginalGender
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GenderSectionViewModel: SimpleSectionViewModel(GenderChoicesGroup) {
    val playerGender: Flow<Gender> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            allChoices.filterIsInstance<OriginalGender>().single().originalGender
        }
    }

    fun setGender(gender: Gender) {
        mainStateViewModel.selectedChoices = mainStateViewModel.selectedChoices.let {
            it.filter { it !is OriginalGender }.plus(OriginalGender(gender))
        }
    }
}