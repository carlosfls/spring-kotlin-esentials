package org.carlosacademic.springkotlinesentials.poo.nestedAndInnerClases

fun main() {
    val cores = Notebook.Processor(4).getProcessorCores()

    println("I have $cores cores")

    val myGame = Game()

    val marquer = myGame.Marquer()

    marquer.incrementPoints(10)

    println(myGame.points)
}