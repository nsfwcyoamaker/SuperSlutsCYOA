package com.freakycyoas.supersluts.data.identity

import com.freakycyoas.supersluts.data.SingleChoiceSelector
import com.freakycyoas.supersluts.model.ChoicesGroup

object IdentityChoicesGroup: ChoicesGroup by SingleChoiceSelector(listOf(IdentityKnownIdentity, IdentitySecretIdentity, IdentityProtectedIdentity))