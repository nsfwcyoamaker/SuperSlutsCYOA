package com.freakycyoas.supersluts.data.genitals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleDrawbackChoice
import com.freakycyoas.supersluts.model.DrawbackChoice
import com.freakycyoas.supersluts.model.pp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.genitals_LIQUID_FOUNTAIN

@Immutable
@Stable
object GenitalsLiquidFountain: DrawbackChoice by SimpleDrawbackChoice(
    image = Res.drawable.genitals_LIQUID_FOUNTAIN,
    name = "LIQUID FOUNTAIN",
    text = AnnotatedString("Whenever you cum you will ejaculate huge amounts of sexual fluid! Like a penis would become a cum hose during climax with this drawback."),
    givenPowerPoints = 10.pp,
    linkedMainChoice = { GenitalsSuperPenis },
)