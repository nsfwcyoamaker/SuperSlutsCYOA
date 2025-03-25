package com.freakycyoas.supersluts.data.perks

import com.freakycyoas.supersluts.data.MultipleMixedChoiceSelector
import com.freakycyoas.supersluts.model.ChoicesGroup

object PerksChoicesGroup: ChoicesGroup by MultipleMixedChoiceSelector(listOf(
    PerkRapeLicense,
    PerkSuperVehicle,
    PerkVacations,
    PerkPrivatePrison(),
    PerkPrisonTransferPass,
    PerkOlympusMembership,
    PerkPrManager,
    PerkGrapplingGun,
    PerkConsentContract,
))