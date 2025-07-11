package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    //inmutables
    println("Inmutables")
    val myList = listOf(1, 2, 3, 4, 5)

    println("The size of the list is: ${myList.size}")
    println("The third element is: ${myList[2]}")
    println("The second element is: ${myList.get(1)}")
    println("The second element is: ${myList.elementAt(1)}")



    //mutables
    println("Mutables")
    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
    myMutableList.add(6)
    myMutableList.removeAt(0)
    myMutableList.remove(2)

    println("The size of the list is: ${myMutableList.size}")
    println("The third element is: ${myMutableList[2]}")
    println("The second element is: ${myMutableList.elementAt(1)}")
    println("The list is: $myMutableList")
}