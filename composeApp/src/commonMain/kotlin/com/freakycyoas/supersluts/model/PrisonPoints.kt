package com.freakycyoas.supersluts.model

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.supersluts.theme.prisonPointsStyle

data class PrisonPoints(override val amount: Int): Points {
    companion object {
        val style = prisonPointsStyle

        val name = "Prison Points"
    }

    override val style: SpanStyle
        get() = Companion.style

    override val name: String
        get() = Companion.name

    operator fun plus(other: PrisonPoints): PrisonPoints {
        return (this.amount + other.amount).prisonPoints
    }
    operator fun minus(other: PrisonPoints): PrisonPoints {
        return (this.amount - other.amount).prisonPoints
    }
    operator fun times(amount: Int): PrisonPoints {
        return (this.amount * amount).prisonPoints
    }
}

val Int.prisonPoints
    get() = PrisonPoints(this)
