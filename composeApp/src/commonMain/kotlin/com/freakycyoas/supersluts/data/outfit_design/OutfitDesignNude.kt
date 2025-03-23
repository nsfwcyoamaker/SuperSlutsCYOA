package com.freakycyoas.supersluts.data.outfit_design

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.power_source.PowerSourceSymbionte
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorSexySecret
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.outfit_design_NUDE

@Immutable
@Stable
object OutfitDesignNude: MainChoice by SimpleMainChoice(
    image = Res.drawable.outfit_design_NUDE,
    name = "NUDE",
    text = AnnotatedString("Superheroes are legally allowed to wear whatever they want, so why wear anything at all? Why cover that beautiful body up when you can show it off to the world? Don’t you want everyone to stare and lust after your perfect body?"),
    goldPoints = 18.gp,
    incompatibleWith = { listOf(PowerSourceSymbionte, SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, SponsorSexySecret) }
)