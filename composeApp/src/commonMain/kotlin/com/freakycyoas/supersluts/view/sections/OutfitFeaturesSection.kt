package com.freakycyoas.supersluts.view.sections

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.outfit_features.OutfitFeaturesChoicesGroup
import com.freakycyoas.supersluts.view.MainPageSection

object OutfitFeaturesSection: MainPageSection by MixedSection(
    title = "OUTFIT FEATURES",
    description = AnnotatedString("That looks good, but it’s a bit too plain. We will need to add some details to make your outfit stand out more. You don’t want to look like a basic bitch, now do you? You can pick as many features as you would like, there is no need to hold back."),
    group = OutfitFeaturesChoicesGroup,
)