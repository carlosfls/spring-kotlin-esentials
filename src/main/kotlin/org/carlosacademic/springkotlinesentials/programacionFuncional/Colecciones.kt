package org.carlosacademic.springkotlinesentials.programacionFuncional

data class Persona2(val nombre: String, val edad: Int)

fun main() {
    val personas = listOf(
        Persona2("Carlos", 20),
        Persona2("Ana", 15),
        Persona2("Juan", 25),
        Persona2("Pedro", 30),
        Persona2("Maria", 25)
    )

    //map
    val numbers = personas.map { it.edad }

    val mayores = numbers.filter { it >= 18 }

    val totalAges = personas.sumOf { it.edad }

    val oldest = personas.maxByOrNull { it.edad }

    val alguienConLetraJ = personas.any { it.nombre.contains("J") }

    val cantidadConLetraJ = personas.count { it.nombre.contains("J") }


    println(numbers)
}