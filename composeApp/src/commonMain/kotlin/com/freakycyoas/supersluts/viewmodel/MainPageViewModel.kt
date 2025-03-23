package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.powers.PowersSummonMinion
import com.freakycyoas.supersluts.data.sponsor.SponsorNoSponsor
import com.freakycyoas.supersluts.di.global
import com.freakycyoas.supersluts.view.MainPageSection
import com.freakycyoas.supersluts.view.sections.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.kodein.di.instance

class MainPageViewModel {
    private val mainStateViewModel: MainStateViewModel by global.instance()

    val sections: Flow<List<MainPageSection>> by lazy {
        mainStateViewModel.currentSelectedChoicesFlow.map { allChoices ->
            listOfNotNull(
                MainTitleSection,

                GenderSection,
                AppearanceSection,
                HairColorSection,
                BodyFigureSection,
                BodySizeSection,
                BreastSizeSection,
                ButtSizeSection,
                GenitalsSection,

                AppearanceDisclaimerSection,

                PowerSourceSection,
                PowersSection,
                allChoices
                    .singleOrNull { it::class == PowersSummonMinion::class }
                    ?.let { it as PowersSummonMinion }
                    ?.takeIf { it.selectedLevel != null }
                    ?.let {
                        MinionPowersSection(it.selectedLevel!!)
                    },

                SafetyDisclaimerSection,

                SponsorSection,
                ContractsSection.takeIf { allChoices.none { it == SponsorNoSponsor } },
                SocialClassSection,
                SuperheroLicenseSection,
                OutfitDesignSection,
                OutfitFeaturesSection,
                IdentitySection,
                JobSection,
                BaseSection,
                //perks
                //superheroines
                //supervillains
                //fate

                EndingSection,
            )
        }
    }
}