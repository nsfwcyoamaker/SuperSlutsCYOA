package com.freakycyoas.supersluts.data.genitals

import com.freakycyoas.supersluts.data.withDrawbacks
import com.freakycyoas.supersluts.model.Choice
import com.freakycyoas.supersluts.model.ChoicesGroup
import com.freakycyoas.supersluts.model.MainChoice

object GenitalsChoicesGroup: ChoicesGroup {
    override val choices: List<MainChoice> = listOf(
        GenitalsVagina,
        GenitalsSmallPenis,
        GenitalsMediumPenis,
        GenitalsLargePenis,
        GenitalsBigPenis,
        GenitalsSuperPenis
    )

    override fun onChoiceSelected(choice: Choice, allSelectedChoices: List<Choice>): List<Choice> {
        require(choice in choices.withDrawbacks)

        return when (choice) {
            is GenitalsVagina -> {
                if(allSelectedChoices.contains(GenitalsVagina)) {
                    allSelectedChoices.minus(GenitalsVagina)
                } else {
                    allSelectedChoices
                        .filterNot { it in choices && it is MainChoice }
                        .plus(GenitalsVagina)
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

                    val hasPenisVagina = allSelectedChoices.contains(GenitalsPenisVagina)

                    allSelectedChoices
                        //if penis vagina false -> remove vagina
                        .let { if(!hasPenisVagina) { it.minus(GenitalsVagina) } else it }
                        //remove other penis
                        .removePenises()
                        //add penis
                        .plus(choice)
                }
            }
            is GenitalsPenisVagina -> {
                if(allSelectedChoices.contains(GenitalsPenisVagina)) {
                    allSelectedChoices
                        .removePenises()
                        .minus(GenitalsPenisVagina)
                } else {
                    allSelectedChoices.plus(GenitalsPenisVagina)
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

    private fun List<Choice>.removePenises(): List<Choice> = this.filterNot { it in choices && it is MainChoice && it !is GenitalsVagina }
}