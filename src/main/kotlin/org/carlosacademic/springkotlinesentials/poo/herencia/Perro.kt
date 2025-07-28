package org.carlosacademic.springkotlinesentials.poo.herencia

class Perro(edad: Int): Animal(edad) {

    init {
        println("Soy un perro")
    }

    override fun comer() {
        println("Estoy comiendo carne")
    }

    fun ladrar() {
        println("Woof")
    }

}