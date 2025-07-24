package org.carlosacademic.springkotlinesentials.poo.extensiones

fun String.secondChar() = get(1)

val String.thirdChar: Char
    get() = get(2)