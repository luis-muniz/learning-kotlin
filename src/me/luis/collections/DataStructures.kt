package me.luis.collections

fun main(){

    // mutable list
    val list = listOf(1,2,3,4,5)
    println("$list")
    println("position 3: ${list[3]}")
    println("size: ${list.size}")
    println("is empty? 3: ${list.isEmpty()}")

    // immutable list
    val anotherList = mutableListOf(1,2,3,4,5)
    anotherList[0] = 3
    println("$anotherList")
    anotherList.add(3)
    anotherList.remove(4)
    println("$anotherList")

    // set
    val set: Set<Int> = anotherList.toSet()
    println("$set")

    // Map
    val map: Map<String,Int> = mapOf(
            "jan" to 1,
            "fev" to 2,
            "mar" to 3
    )
    println(map)
    println(map.containsKey("jan"))
    println(map.containsValue(3))
    println(map.keys)
    println(map["mar"])

    val myArray: Array<String> = arrayOf("Jesus", "Paulo", "João", "Maria")

    myArray.forEach{
        println(it.length)
    }

    println(myArray[3])
    println(myArray.size)

}