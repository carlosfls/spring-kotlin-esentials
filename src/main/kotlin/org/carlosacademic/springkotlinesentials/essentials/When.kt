package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    val edad = 45

    when {
        edad >= 18 -> println("Es mayor que edad")
        edad < 18 -> println("Es menor de edad")
        else -> {
            println("Edad no valida")
        }
    }

    when (edad) {
        in 1..18 -> println("Menor de edad")
        in 19..65 -> println("Adulto")
        in 66..100 -> println("Adutlo Mayor")
        else -> println("Edad no valida")
    }
}