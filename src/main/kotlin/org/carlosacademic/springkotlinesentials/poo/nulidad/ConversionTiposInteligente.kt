package org.carlosacademic.springkotlinesentials.poo.nulidad

fun main() {

    var valor: Any = "Perez"

    var esValorString = valor is String
    var noEsValorString = valor !is String


    println(esValorString)
    println(noEsValorString)
}

fun getValueLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }else{
        return 0
    }
}