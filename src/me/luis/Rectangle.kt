package me.luis

open class Rectangle(val weight: Double, val height: Double):Shape {
    override fun getArea(): Double {
        return this.height * this.weight
    }
}