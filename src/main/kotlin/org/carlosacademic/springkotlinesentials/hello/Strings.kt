package org.carlosacademic.springkotlinesentials.hello

fun main() {
    var nombre = "Pepe"
    var apellido = "Perez"

    println("Nombre: $nombre, Apellido: $apellido")

    var edad = 20

    println("${if (edad >= 18) "Im a" else "Im not"} a man")
}