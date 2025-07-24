package org.carlosacademic.springkotlinesentials.poo.nestedAndInnerClases

class Game {
    var points = 0

    inner class Marquer() {

        fun incrementPoints(pointsToIncrement: Int){
            points = points + pointsToIncrement
        }

        fun decrementPoints(pointsToDecrement: Int){
            points = points - pointsToDecrement
        }

    }
}