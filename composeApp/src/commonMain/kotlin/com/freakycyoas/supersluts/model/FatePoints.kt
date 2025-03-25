package com.freakycyoas.supersluts.model

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.supersluts.theme.fatePointsStyle

data class FatePoints(override val amount: Int): Points {
    companion object {
        val style = fatePointsStyle

        val name = "Fate Points"
    }

    override val style: SpanStyle
        get() = Companion.style

    override val name: String
        get() = Companion.name

    operator fun plus(other: FatePoints): FatePoints {
        return (this.amount + other.amount).fp
    }
    operator fun minus(other: FatePoints): FatePoints {
        return (this.amount - other.amount).fp
    }
    operator fun times(amount: Int): FatePoints {
        return (this.amount * amount).fp
    }
}

val Int.fp
    get() = FatePoints(this)
