package com.freakycyoas.supersluts.data.gender

import com.freakycyoas.supersluts.data.SingleChoiceSelector
import com.freakycyoas.supersluts.model.ChoicesGroup

object GenderChoicesGroup: ChoicesGroup by SingleChoiceSelector(listOf(
    GenderFemale,
    GenderMale
))