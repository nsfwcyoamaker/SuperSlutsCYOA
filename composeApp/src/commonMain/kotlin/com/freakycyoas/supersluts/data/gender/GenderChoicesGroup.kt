package com.freakycyoas.supersluts.data.gender

import com.freakycyoas.supersluts.data.SingleChoiceSelector
import com.freakycyoas.supersluts.model.ChoicesGroup

object GenderChoicesGroup: ChoicesGroup by SingleChoiceSelector(listOf(
    com.freakycyoas.supersluts.data.gender.GenderFemale,
    com.freakycyoas.supersluts.data.gender.GenderMale
))