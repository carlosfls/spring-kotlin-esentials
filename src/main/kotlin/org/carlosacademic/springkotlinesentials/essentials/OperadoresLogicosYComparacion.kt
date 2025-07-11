package org.carlosacademic.springkotlinesentials.essentials

fun main() {
    val a = 1
    val b = 5
    val c = 0

    val d = a > b
    val e = b < c
    val f = (c+3) > a

    val op1 = d && e
    val op2 = f && e
    val op3 = (d || f) && (!e || f)
    println("Op1: " + op1)
    println("Op2: " + op2)
    println("Op3: " + op3)
}