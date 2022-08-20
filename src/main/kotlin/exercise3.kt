package com.exercise3
// The longest word

fun findLongestWord(str: String) {
    val strs = str.split(" ")

    var longestWord: String = ""
    for (elm in strs) {
        if (elm.length > longestWord.length) {
            longestWord = elm
        }
    }
    println("word: $longestWord count:${longestWord.length}")
}