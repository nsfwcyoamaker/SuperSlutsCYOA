package com.freakycyoas.supersluts.utils

fun <T> List<T>.containsNone(elements: Collection<T>): Boolean {
    return !this.any { elements.contains(it) }
}

fun <T> List<T>.containsAny(elements: Collection<T>): Boolean {
    return this.any { elements.contains(it) }
}

fun <T> List<T>.byRow(span: Int): List<List<T>> {
    return this
        .withIndex()
        .groupBy({ it.index / span }, { it.value })
        .values
        .toList()
}

fun <T> List<T>.replace(item: T, with: T): List<T> {
    return this
        .toMutableList()
        .apply { this[indexOf(item)] = with }
        .toList()
}