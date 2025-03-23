package com.freakycyoas.supersluts.model

interface MultibuyMainChoice: MainChoice {
    val boughtTimes: Int
    fun ofAmount(newAmount: Int): MultibuyMainChoice
}
