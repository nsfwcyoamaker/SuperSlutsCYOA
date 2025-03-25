package com.freakycyoas.supersluts.data.job

import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.data.contracts.ContractsDateLottery
import com.freakycyoas.supersluts.data.sponsor.SponsorBlissIndustries
import com.freakycyoas.supersluts.data.sponsor.SponsorDawnGenetics
import com.freakycyoas.supersluts.data.sponsor.SponsorWaltDisney
import com.freakycyoas.supersluts.data.sponsor.SponsorXoxo
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.job_PROSTITUTE

object JobProstitute: MainChoice by SimpleMainChoice(
    image = Res.drawable.job_PROSTITUTE,
    name = "PROSTITUTE",
    text = AnnotatedString("You will sell your body on the streets. While prostitution is legal and the pay is very good, people will ostracize you for it, you will be treated like a dirty whore. They will gladly fuck you, but no one will want to date you. You can pretty much forget about ever having a serious relationship or getting married."),
    goldPoints = 15.gp,
    incompatibleWith = { listOf(SponsorWaltDisney, SponsorBlissIndustries, SponsorDawnGenetics, SponsorXoxo, ContractsDateLottery) },
)