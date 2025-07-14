package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    val edad = 25;

    if (edad >= 18) {
        println("eres mayor de edad")
    } else {
        println("aun eres menor")
    }

    var esMayor : String = if (edad >= 18) "si" else "no"

    println("esMayor es: $esMayor")
}