package com.exercise5


/*
    (234, "10:00", "Montauk") and ("NY Penn," "Babylon," "Sayville"),
    the output should be "10:00 train number 234 to Montauk is stopping
    at NY Penn, Babylon and Sayville."
*/

fun createTrainRoute(trainStops: Array<String>): String {
    var trainRoute = trainStops.slice(0 until trainStops.size-1).joinToString(", ")
    trainRoute += " and ${trainStops[trainStops.size - 1]}"
    return "is stopping at $trainRoute"
}