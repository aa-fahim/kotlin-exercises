/*
	Exercise 2
    Capitalization
*/

package com.exercise2

fun convertString(str: String, case: String): String {
    if (case == "upper") {
        return str.uppercase()
    }
    return str.lowercase()
}

fun formatStringCase(str: String, case: String = "camelcase"): String {
    var strs = str.split(" ").toTypedArray()

    if (case == "snakecase") {
        for (i in strs.indices) {
            strs[i] = strs[i][0].lowercase() + strs[i].slice(1 until strs[i].length)
        }
        return strs.joinToString(separator = "_")
    }

    for (i in strs.indices) {
        strs[i] = strs[i][0].uppercase() + strs[i].slice(1 until strs[i].length)
    }

    return strs.joinToString("")
}
