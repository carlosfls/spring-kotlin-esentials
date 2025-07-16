package org.carlosacademic.springkotlinesentials.essentials

import java.time.LocalDate
import kotlin.math.PI
import kotlin.math.pow

fun main() {
    println("Inicio del Programa!")

    //mostrarfecha()
    //felicitar("Carlos", 25)
    //saludarPorNombreYPais(pais = "Roma")
    //println(areaDelCirculo(2.0))
    //val dividrNumero = dividrNumero(2.0, 3.0)
    //println("El resultado de la division es: $dividrNumero")
}

fun mostrarfecha(){
    val fecha = LocalDate.now()
    println("La fecha es: $fecha")
}

fun felicitar(nombre: String, edad: Int) : Unit{
    println("Felicidades $nombre, por tus $edad anos")
}

fun saludarPorNombreYPais(nombre : String = "Extrano", pais: String = "Desconocido"){
    println("Hola $nombre de $pais")
}

fun areaDelCirculo(radio: Double): Double {
    return PI * radio.pow(2);
}

fun calcularDouble(numero: Int) = numero * 2;

fun dividrNumero(divivendo: Double, divisor: Double) : Double{
    fun validarDivisor(divisor: Double) {
        if(divisor == 0.0) {
            throw IllegalArgumentException("El divisor no puede ser cero")
        }
    }
    validarDivisor(divisor)
    return divivendo / divisor;
}

fun calcularMedia(vararg valores: Double) : Double{
    var suma = 0.0
    for(nota in valores) {
        suma += nota
    }
    return suma / valores.size
}