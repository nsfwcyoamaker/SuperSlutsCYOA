package com.freakycyoas.supersluts.viewmodel

import com.freakycyoas.supersluts.data.FatePointsModifier
import com.freakycyoas.supersluts.data.GoldPointsModifier
import com.freakycyoas.supersluts.data.PowerPointsModifier
import com.freakycyoas.supersluts.data.gender.Gender
import com.freakycyoas.supersluts.data.gender.OriginalGender
import com.freakycyoas.supersluts.model.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map

class MainStateViewModel {
    private val _currentSelectedChoicesFlow by lazy { MutableStateFlow<List<Choice>>(listOf(OriginalGender(Gender.MALE))) }

    var selectedChoices: List<Choice>
        get() = currentSelectedChoicesFlow.value
        set(value) {
            _currentSelectedChoicesFlow.value = value.cleanNotEnabled()
        }

    val currentSelectedChoicesFlow
        get() = _currentSelectedChoicesFlow.asStateFlow()

    val currentPowerPoints: Flow<PowerPoints> by lazy { currentSelectedChoicesFlow.map(::calculatePowerPoints) }
    val currentGoldPoints: Flow<GoldPoints> by lazy { currentSelectedChoicesFlow.map(::calculateGoldPoints) }
    val currentOutfitGoldPoints: Flow<GoldPoints?> by lazy { currentSelectedChoicesFlow.map(::calculateOutfitGoldPoints).map { it.takeIf { it.amount > 0 } } }
    val currentFatePoints: Flow<FatePoints> by lazy { currentSelectedChoicesFlow.map(::calculateFatePoints) }

    private fun calculatePowerPoints(allChoices: List<Choice>): PowerPoints {
        val modifiers = allChoices.filterIsInstance<PowerPointsModifier>().sortedByDescending { it.priority }

        return allChoices.sumOf { choice ->
            var points = choice.grantedPowerPoints(allChoices)
            modifiers.forEach { modifier ->
                points = modifier.modifyGrantedPowerPoints(allChoices, choice, points)
            }
            points.amount
        }.pp
    }

    private fun calculateGoldPoints(allChoices: List<Choice>): GoldPoints {
        val outfitRemainingCost = calculateOutfitGoldPoints(allChoices).amount.coerceAtMost(0)

        val modifiers = allChoices.filterIsInstance<GoldPointsModifier>().sortedByDescending { it.priority }

        return allChoices.sumOf { choice ->
            var points = choice.grantedGoldPoints(allChoices)
            modifiers.forEach { modifier ->
                points = modifier.modifyGrantedGoldPoints(allChoices, choice, points)
            }
            points.amount
        }.plus(outfitRemainingCost).gp
    }

    private fun calculateOutfitGoldPoints(allChoices: List<Choice>): GoldPoints {
        val modifiers = allChoices.filterIsInstance<GoldPointsModifier>().sortedByDescending { it.priority }

        return allChoices.sumOf { choice ->
            var points = choice.grantedOutfitGoldPoints(allChoices)
            modifiers.forEach { modifier ->
                points = modifier.modifyGrantedOutfitGoldPoints(allChoices, choice, points)
            }
            points.amount
        }.gp
    }

    private fun calculateFatePoints(allChoices: List<Choice>): FatePoints {
        val modifiers = allChoices.filterIsInstance<FatePointsModifier>().sortedByDescending { it.priority }

        return allChoices.sumOf { choice ->
            var points = choice.grantedFatePoints(allChoices)
            modifiers.forEach { modifier ->
                points = modifier.modifyGrantedFatePoints(allChoices, choice, points)
            }
            points.amount
        }.fp
    }
}

private fun List<Choice>.cleanNotEnabled(): List<Choice> {
    return this.filter { it.canBeTaken(this) }
}
