package org.carlosacademic.springkotlinesentials.poo.herencia

open class Animal(val edad: Int) {

    init {
        println("Soy un animal")
    }

    open fun comer(){
        println("Estoy comiendo")
    }

    fun dormir(){
        println("Estoy dormido")
    }
}