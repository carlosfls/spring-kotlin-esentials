package org.carlosacademic.springkotlinesentials.programacionFuncional

fun main() {
    val result = {x: Int, y: Int -> x + y}

    println(result(1, 2))
}