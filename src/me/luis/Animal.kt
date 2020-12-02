package me.luis

abstract class Animal {

    protected abstract val sound: String

    fun doSound(){
        println("${javaClass.simpleName} diz $sound")
    }
}