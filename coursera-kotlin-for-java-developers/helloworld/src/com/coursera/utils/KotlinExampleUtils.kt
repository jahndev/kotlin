package com.coursera.utils

fun exampleLoop() : Unit  {
    for (c in '0' until '9') {
        print(c)
    }
}

fun exampleLoop2() = listOf(1 in 1..9)

fun isValidIdentifier(s: String): Boolean {
    var isValid = true
    if(s.isEmpty()) return false
    s.forEachIndexed { index, c ->
        isValid = isValid && when (c) {
            ' ' -> index == 0
            '_' -> index == 0
            in 'a'..'z' -> true
            in 'A'..'Z' -> true
            in '0'..'9' -> index > 0
            else -> false
        }
    }
    return isValid
}

