package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    var counter = 0

    while (counter < 10) {
        println("Counter: $counter")
        counter++
    }

    do {
        println("Counter: $counter")
        counter--
    }while (counter > 0)
}