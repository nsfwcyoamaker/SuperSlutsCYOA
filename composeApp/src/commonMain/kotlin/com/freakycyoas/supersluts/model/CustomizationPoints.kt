package com.freakycyoas.supersluts.model

import androidx.compose.ui.text.SpanStyle
import com.freakycyoas.supersluts.theme.customizationPointsStyle

data class CustomizationPoints(override val amount: Int): Points {
    companion object {
        val style = customizationPointsStyle

        val name = "Customization Points"
    }

    override val style: SpanStyle
        get() = Companion.style

    override val name: String
        get() = Companion.name

    operator fun plus(other: CustomizationPoints): CustomizationPoints {
        return (this.amount + other.amount).customizationPoints
    }
    operator fun minus(other: CustomizationPoints): CustomizationPoints {
        return (this.amount - other.amount).customizationPoints
    }
    operator fun times(amount: Int): CustomizationPoints {
        return (this.amount * amount).customizationPoints
    }
}

val Int.customizationPoints
    get() = CustomizationPoints(this)
