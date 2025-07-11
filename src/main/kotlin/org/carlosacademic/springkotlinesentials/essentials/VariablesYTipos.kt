package org.carlosacademic.springkotlinesentials.essentials

const val NUMERO_DE_PAGINAS = 10

fun main(){

    //variables
    var age = 42
    var capacity = 1.5
    var numberOfGuests: Int

    numberOfGuests = 10

    println("The age is $age")
    println("The capacity is $capacity")
    println("The numberOfGuests is $numberOfGuests")

    //constantes
    val identificador = 123456

    println("The number of pages is: $NUMERO_DE_PAGINAS")
    println("The identifier is: $identificador")

    //tipos de numeros enteros
    var myByte: Byte = 127
    var myShort: Short = 150
    var myInt : Int = 500
    var myLong : Long = 100000000000000

    println("The myByte is $myByte")
    println("The short is $myShort")
    println("The myInt is $myInt")
    println("The long is $myLong")

    //decimales
    var myFloat : Float = 12.34F
    var myDouble : Double = 12.34

    println("The myFloat is $myFloat")
    println("The myDouble is $myDouble")
}