package intro

import com.coursera.utils.exampleLoop
import com.coursera.utils.exampleLoop2
import com.coursera.utils.isValidIdentifier

fun main () {
    val name = "kotloin"
    println("Hello, $name!")
    exampleLoop()

    print("\n")
    print("loop2 start\n")
    exampleLoop2()
    print("loop2 end\n")

    //Checking identifier
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false

}