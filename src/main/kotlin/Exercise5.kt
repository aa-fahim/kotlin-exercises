package com.exercise5

/*
    (234, "10:00", "Montauk") and ("NY Penn," "Babylon," "Sayville"),
    the output should be "10:00 train number 234 to Montauk is stopping
    at NY Penn, Babylon and Sayville."
*/

class TrainDetails(val trainNumber: Number, val destination: String, val time: String)

fun createTrainRoute(trainDetails: TrainDetails, trainStops: Array<String>): String {
    var trainRoute = trainStops.slice(0 until trainStops.size-1).joinToString(", ")
    trainRoute += " and ${trainStops[trainStops.size - 1]}"
    return "${trainDetails.time} train number ${trainDetails.trainNumber} to ${trainDetails.destination} is stopping at $trainRoute"
}