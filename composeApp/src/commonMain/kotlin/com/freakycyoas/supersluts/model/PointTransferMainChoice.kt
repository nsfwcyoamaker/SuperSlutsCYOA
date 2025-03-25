package com.freakycyoas.supersluts.model

interface PointTransferMainChoice: MainChoice {
    val amountTransferred: Int?
    fun ofAmount(newAmount: Int): PointTransferMainChoice
    fun grantedPoints(): Points
    fun consumedPoints(): Points
}