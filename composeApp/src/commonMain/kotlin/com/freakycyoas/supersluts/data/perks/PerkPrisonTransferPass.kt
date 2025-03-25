package com.freakycyoas.supersluts.data.perks

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.AnnotatedString
import com.freakycyoas.supersluts.data.SimpleMainChoice
import com.freakycyoas.supersluts.model.MainChoice
import com.freakycyoas.supersluts.model.gp
import superslutscyoa.composeapp.generated.resources.Res
import superslutscyoa.composeapp.generated.resources.perks_PRISON_TRANSFER_PASS

@Immutable
@Stable
object PerkPrisonTransferPass: MainChoice by SimpleMainChoice(
    image = Res.drawable.perks_PRISON_TRANSFER_PASS,
    name = "PRISON TRANSFER PASS",
    text = AnnotatedString("If you ever get into some legal troubles you might want to consider buying a Prison Transfer Pass from OSI. The pass will cost you a monthly fee and it's not that useful for a licensed superhero, but for a vigilante it most certainly is. Having a Prison Transfer Pass will allow you to choose which super prison you will spend your prison time in and let's just say some prisons are better than others. You wouldn't believe what they do to some prisoners in certain super prisons. Choose your prison using the Super Prison CYOA, you must play as a prisoner and you can't purchase Join The Dark Side."),
    goldPoints = (-5).gp
)
