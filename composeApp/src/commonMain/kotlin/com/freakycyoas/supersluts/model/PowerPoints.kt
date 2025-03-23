package com.freakycyoas.supersluts.model

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.supersluts.theme.powerPointsStyle

data class PowerPoints(override val amount: Int): Points {
    companion object {
        val style = powerPointsStyle
    }

    override val style: SpanStyle
        get() = Companion.style

    operator fun plus(other: PowerPoints): PowerPoints {
        return (this.amount + other.amount).pp
    }
    operator fun minus(other: PowerPoints): PowerPoints {
        return (this.amount - other.amount).pp
    }
    operator fun times(amount: Int): PowerPoints {
        return (this.amount * amount).pp
    }
}

val Int.pp
    get() = PowerPoints(this)
