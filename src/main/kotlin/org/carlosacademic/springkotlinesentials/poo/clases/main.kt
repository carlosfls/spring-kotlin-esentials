package org.carlosacademic.springkotlinesentials.poo.clases

fun main() {
    /*
    var rectangulo = Rectangulo()

    rectangulo.alto = 10
    rectangulo.grosor = 1

    println(rectangulo.ancho)

    println(rectangulo.area())

    println(rectangulo.esCuadrado)

     */

    /*
    var miDireccion: Direccion = Direccion("Joao Luiza","88034567","SC")
    println(miDireccion.toString())

    var miDireccion2 = Direccion("Joao Luiza","88034567","SC")
    println(miDireccion.equals(miDireccion2))

    var miDireccion3 = miDireccion2.copy("Mariano Ventura")
    println(miDireccion3.toString())
     */

    val lunes = DAYS.LUNES;
    println(lunes)

    for(day in DAYS.entries) {
        println(day)
    }
}