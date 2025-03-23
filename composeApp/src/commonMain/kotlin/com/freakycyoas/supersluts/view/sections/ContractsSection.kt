package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.contracts.ContractsChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object ContractsSection: MainPageSection by SimpleSection(
    title = "CONTRACTS",
    description = AnnotatedString("That’s a good start! But a sponsor is not enough if you want to live the good life! You will need to make some contracts with your sponsor unless you don’t mind living like a total hobo? I didn’t think so. So let’s see what contracts you can cash in on!"),
    group = ContractsChoicesGroup,
)