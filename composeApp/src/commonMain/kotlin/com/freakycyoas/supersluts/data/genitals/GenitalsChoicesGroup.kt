package com.freakycyoas.supersluts.data.genitals

import com.freakycyoas.supersluts.data.withDrawbacks
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.ChoicesGroup
import com.freakycyoas.supersluts.model.MainChoice

object GenitalsChoicesGroup: ChoicesGroup {
    override val choices: List<MainChoice> = listOf(
        com.freakycyoas.supersluts.data.genitals.GenitalsVagina,
        com.freakycyoas.supersluts.data.genitals.GenitalsSmallPenis,
        com.freakycyoas.supersluts.data.genitals.GenitalsMediumPenis,
        com.freakycyoas.supersluts.data.genitals.GenitalsLargePenis,
        com.freakycyoas.supersluts.data.genitals.GenitalsBigPenis,
        com.freakycyoas.supersluts.data.genitals.GenitalsSuperPenis
    )

    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choice in com.freakycyoas.supersluts.data.genitals.GenitalsChoicesGroup.choices.withDrawbacks)

        return when (choice) {
            is com.freakycyoas.supersluts.data.genitals.GenitalsVagina -> {
                if(allSelectedChoices.contains(com.freakycyoas.supersluts.data.genitals.GenitalsVagina)) {
                    allSelectedChoices.minus(com.freakycyoas.supersluts.data.genitals.GenitalsVagina)
                } else {
                    allSelectedChoices
                        .filterNot { it in com.freakycyoas.supersluts.data.genitals.GenitalsChoicesGroup.choices && it is MainChoice }
                        .plus(com.freakycyoas.supersluts.data.genitals.GenitalsVagina)
                }
            }
            is MainChoice /*(choice is a penis type)*/ -> {
                if(allSelectedChoices.contains(choice)) {
                    allSelectedChoices.minus(choice)
                } else {
                    /*
                        adding a penis:
                            if penis vagina false -> remove vagina, remove other penis, add penis
                            if penis vagina true -> remove other penis, add penis

                            same as
                            if penis vagina false -> remove vagina
                            remove other penis
                            add penis
                         */

                    val hasPenisVagina = allSelectedChoices.contains(com.freakycyoas.supersluts.data.genitals.GenitalsPenisVagina)

                    allSelectedChoices
                        //if penis vagina false -> remove vagina
                        .let { if(!hasPenisVagina) { it.minus(com.freakycyoas.supersluts.data.genitals.GenitalsVagina) } else it }
                        //remove other penis
                        .removePenises()
                        //add penis
                        .plus(choice)
                }
            }
            is com.freakycyoas.supersluts.data.genitals.GenitalsPenisVagina -> {
                if(allSelectedChoices.contains(com.freakycyoas.supersluts.data.genitals.GenitalsPenisVagina)) {
                    allSelectedChoices
                        .removePenises()
                        .minus(com.freakycyoas.supersluts.data.genitals.GenitalsPenisVagina)
                } else {
                    allSelectedChoices.plus(com.freakycyoas.supersluts.data.genitals.GenitalsPenisVagina)
                }
            }
            else /*(choice is a simple drawback)*/ -> {
                if(allSelectedChoices.contains(choice)) {
                    allSelectedChoices.minus(choice)
                } else {
                    allSelectedChoices.plus(choice)
                }
            }
        }
    }

    private fun List<Choice>.removePenises(): List<Choice> = this.filterNot { it in com.freakycyoas.supersluts.data.genitals.GenitalsChoicesGroup.choices && it is MainChoice && it !is com.freakycyoas.supersluts.data.genitals.GenitalsVagina }
}