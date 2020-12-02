package me.luis

interface Shape {
    fun getArea(): Double

    fun printArea(){
        val formattedArea = "%.2f".format(getArea())
        println(formattedArea)
    }
}