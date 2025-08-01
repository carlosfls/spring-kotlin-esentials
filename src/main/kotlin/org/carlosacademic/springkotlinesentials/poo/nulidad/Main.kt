package org.carlosacademic.springkotlinesentials.poo.nulidad

import java.util.Locale.getDefault

fun main() {

    var nombre : String? = null

    var apellido = "Perez"


    var nombreUpperCase = nombre?.uppercase(getDefault())

    var nombreReversed = nombre?.reversed() ?: "SIN NOMBRE"

    print(nombreUpperCase)
    print(nombreReversed)
    print(apellido)
}