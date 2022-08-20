package com.exercise7

fun printFizzBuzz(n: Int): List<String> {
    var res = mutableListOf<String>()

    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            res.add("FizzBuzz")
        } else if (i % 5 == 0) {
            res.add("Buzz")
        } else if (i % 3 == 0) {
            res.add("Fizz")
        } else {
            res.add(i.toString())
        }
    }

    return res;
}