package org.carlosacademic.springkotlinesentials.poo.clases

class Circulo(var radio: Int) {

    constructor(radio: Double) : this(
        radio.toInt()
    )

    constructor(circulo: Circulo) : this(
        circulo.radio
    )

    init {
        require(radio > 0) { "El radio debe ser mayor que 0" }
    }

    fun area() = Math.PI * radio * radio
}