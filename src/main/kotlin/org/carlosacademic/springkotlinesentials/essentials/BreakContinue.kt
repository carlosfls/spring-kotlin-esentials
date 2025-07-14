package org.carlosacademic.springkotlinesentials.essentials

fun main() {

    val lista1 = listOf(1, 2, 3, 4, 5)
    val lista2 = listOf(4, 5, 6, 7, 8)

    for (numero in lista1) {
        for (numero2 in lista2) {
            if (numero == numero2) {
                println("Ambos numeros $numero existen en ambas listas")
                break
            }
        }
    }

    bulce_externo@for (numero in lista1) {
        for (numero2 in lista2) {
            if (numero == numero2) {
                println("Hay al menos un numero en comun entre las dos listas")
                break@bulce_externo
            }
        }
    }
}