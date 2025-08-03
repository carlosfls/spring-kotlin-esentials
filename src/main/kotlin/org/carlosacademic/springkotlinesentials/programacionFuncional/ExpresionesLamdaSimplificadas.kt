package org.carlosacademic.springkotlinesentials.programacionFuncional

data class Persona(val nombre: String, val edad: Int)

fun main() {
    val personas = listOf(Persona("Carlos", 20),
        Persona("Ana", 15),
        Persona("Juan", 25),
        Persona("Pedro", 30),
        Persona("Maria", 25)
    )


    //val mayor = personas.maxBy ({ p: Persona -> p.edad })

    val mayor = personas.maxBy(Persona::edad)
}