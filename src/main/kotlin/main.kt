import com.exercise1.incrementSteps
import com.exercise1.generateFibonacciSequence
import com.exercise2.*
import com.exercise3.findLongestWord
import com.exercise4.encryptMessage
import com.exercise5.createTrainRoute

// https://www.codecademy.com/resources/blog/kotlin-code-challenges-for-beginners/
fun main() {
//    println("Exercise 1")
//    println(incrementSteps(8).contentToString())
//
//    println(generateFibonacciSequence(3).contentToString())

//    println("Exercise 2")
//    println(convertString("hello word", "upper")) // output should be "HELLO WORLD"
//    println(convertString("HELLO WORLD", "lower")) // output should be "hello world"

//    println(formatStringCase("Hello World", "snakecase")) // output should be "hello_world"
//    println(formatStringCase("hello world", "camelcase")) // output should be "HelloWorld"
//    findLongestWord("I love Codecademy")

    // Exercise 4
    // println(encryptMessage("Codecademy is awesome!")) // output should be “Dpefdbefnz jt bxftpnf!”

    val trainRoutes = arrayOf("NY Penn,", "Babylon", "Sayville")
    val trainDetails = ""
    assertEquals(createTrainRoute(trainRoutes), "is stopping at NY Penn, Bablon and Sayville")
}