package org.carlosacademic.springkotlinesentials.essentials

fun main() {

    for (numero  in 1..20) {
        println(numero)
    }

    val palabra1 = "Albahaca"
    val palabra2 = "Carreta"

    if("Becerro" in palabra1 .. palabra2) {
        println("Becerro esta en la palabra")
    }

    for (numero in 1 until 20) {
        println(numero)
    }

    for (num in 1..10 step 2) {
        println(num)
    }

    for (num in 10 downTo 1) {
        println(num)
    }

}