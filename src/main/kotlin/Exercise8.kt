package com.exercise8

fun printSteps(n: Int, char: String = "#") {
    for (i in 0..n) {
        println(char.repeat(i))
    }
}