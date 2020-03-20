package ru.skillbranch.kotlinexample.extensions

fun <T> List<T>.dropLastUntil(predicate: (T) -> Boolean): List<T> {
    var index: Int = this.size
    for (i in this.size - 1 downTo 0) {
        if (predicate(this[i])) index = i
    }
    return this.subList(0, index)
}