package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    val myList = listOf(1, 2, 3, 4, 5)

    if (myList.contains(2)) {
        println("It contains 2")
    }

    if (4 in myList) {
        println("It contains 4")
    }
}