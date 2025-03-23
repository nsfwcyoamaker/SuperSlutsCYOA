package com.freakycyoas.supersluts.data.base

import com.freakycyoas.supersluts.data.SingleChoiceSelector
import com.freakycyoas.supersluts.model.ChoicesGroup

object BaseChoicesGroup: ChoicesGroup by SingleChoiceSelector(
    listOf(
        BaseHideout,
        BaseSecretBase,
        BaseLair,
    )
)