/*
 Exercise 1

 Create a function that counts from 0 to max number
 Function also accepts a parameter to indicate the incremental step counts

 Return the output as an array

 Notes:
 Do not include 0.
 Make default incremental step counter 1.
*/
package com.exercise1

fun incrementSteps(maxNum: Int, stepCounter: Int = 1): Array<Int> {
    var res = arrayOf<Int>()
    for (i in stepCounter..maxNum step stepCounter) {
        res += i
    }
    return res
}

fun generateFibonacciSequence(steps: Int): Array<Int> {
    if (steps == 1) return arrayOf(1)
    if (steps == 2) return arrayOf(1, 1)

    var stepCounter = steps - 2
    var res = arrayOf<Int>(1, 1)
    while (stepCounter != 0) {
        val temp = res[res.size - 1] + res[res.size - 2]
        res += temp
        stepCounter -=1
    }
    return res
}