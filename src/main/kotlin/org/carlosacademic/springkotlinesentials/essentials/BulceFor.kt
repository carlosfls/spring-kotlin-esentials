package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    val animales = listOf<String>("Perro", "Gato", "Pajaro", "Tigre")

    for(animal in animales) {
        println(animal)
    }

    for((indice, animal) in animales.withIndex()) {
        println("El animal en la posicion $indice es $animal")
    }
}