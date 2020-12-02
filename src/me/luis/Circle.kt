package me.luis

class Circle(val radius: Double):Shape {

    override fun getArea(): Double {
        return Math.PI * this.radius * this.radius
    }
}