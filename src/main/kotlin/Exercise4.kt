package com.exercise4

fun encryptMessage(str: String, shift: Int = 1): String {
    var res = ""
    for (char in str) {
        res += (char.toInt() + shift).toChar()
    }
    return res
}