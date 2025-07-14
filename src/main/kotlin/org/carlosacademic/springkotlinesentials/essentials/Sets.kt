package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    val mySet = setOf(1, 2, 3, 4, 5)
    println("The size of the set is: ${mySet.size}")

    val myMutableSet = mutableSetOf(1, 2, 3, 4, 5)
    myMutableSet.add(6)
    myMutableSet.remove(2)
    println("The size of the set is: ${myMutableSet.size}")
    println("The set is: $myMutableSet")
}