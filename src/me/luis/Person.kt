package me.luis

// class with primary constructor
class Person(val name: String, private val birthYear: Int) {

    // execute when the class is instantiated
    init {
        println("Iniciando a classe Person com o valor de name = $name")
    }

    // more constructors with  call to primary constructor
    constructor(name: String,birthYear: Int, isMarried: Boolean): this(name, birthYear)

    // get method
    val age: Int
    get() = 2020 - this.birthYear
}