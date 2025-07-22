package org.carlosacademic.springkotlinesentials.poo.clases

class Rectangulo {

    var ancho: Int = 0
    var alto: Int = 0
    val cantidadDeLados = 4

    val esCuadrado
        get() = ancho == alto

    var grosor: Int = 1
        set(value) {
            if (value < 1){
                throw IllegalArgumentException("Grosor cannot be negative.")
            }
            field = value
        }

    fun area() = ancho * alto
}