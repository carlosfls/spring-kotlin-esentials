package org.carlosacademic.springkotlinesentials.poo.abtractClassesAndInterfaces

class Circle(val height: Double, val large: Double): Shape() {

    override fun getArea(): Double = Math.PI * large * large

    override fun getPerimeter(): Double = 2 * Math.PI * large
}