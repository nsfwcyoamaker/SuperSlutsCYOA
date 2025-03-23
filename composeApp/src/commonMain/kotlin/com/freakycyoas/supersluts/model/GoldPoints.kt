package com.freakycyoas.supersluts.model

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.supersluts.theme.goldPointsStyle

data class GoldPoints(override val amount: Int): Points {
    companion object {
        val style = goldPointsStyle
    }

    override val style: SpanStyle
        get() = Companion.style

    operator fun plus(other: GoldPoints): GoldPoints {
        return (this.amount + other.amount).gp
    }
    operator fun minus(other: GoldPoints): GoldPoints {
        return (this.amount - other.amount).gp
    }
    operator fun times(amount: Int): GoldPoints {
        return (this.amount * amount).gp
    }
}

operator fun GoldPoints?.plus(other: GoldPoints?): GoldPoints? {
    return when {
        this == null && other == null -> null
        this == null && other != null -> other
        this != null && other == null -> this
        //this != null && other != null
        else -> this!! + other!!
    }
}

operator fun GoldPoints?.minus(other: GoldPoints?): GoldPoints? {
    return when {
        this == null && other == null -> null
        this == null && other != null -> other
        this != null && other == null -> this
        //this != null && other != null
        else -> this!! - other!!
    }
}

val Int.gp
    get() = GoldPoints(this)
