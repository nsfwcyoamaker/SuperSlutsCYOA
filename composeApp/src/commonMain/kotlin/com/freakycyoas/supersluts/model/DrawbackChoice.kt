package com.freakycyoas.supersluts.model

import kotlin.reflect.KClass

interface DrawbackChoice: Choice {
    fun getLinkedMainChoices(): List<KClass<out MainChoice>>
}