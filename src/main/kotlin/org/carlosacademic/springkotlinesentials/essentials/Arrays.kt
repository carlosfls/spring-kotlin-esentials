package org.carlosacademic.springkotlinesentials.essentials

fun main() {

    var myArray = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var mySrtingArray = arrayOf("Hola", "Adios")
    var myIntArray = intArrayOf(1, 2, 30)
    var myArrayMixedArray = arrayOf(1, "2", 1.5, false)

    var value = myArray.get(2)

    println("The value is: $value")

    println(mySrtingArray.contains("Hola"))
    println(mySrtingArray.indexOf("Adios"))

}