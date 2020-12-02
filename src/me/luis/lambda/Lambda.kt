package me.luis.lambda

val additions: (Int, Int) -> Int = { a: Int, b: Int -> a + b}

val subtraction = {a: Int, b: Int -> a - b}

fun calculate(a:Int,b:Int, calcFunction:(Int, Int) -> Int):Int{
    return calcFunction.invoke(a,b)
}

fun division(a: Int, b: Int):Int{
    return a/b
}

fun main(){
    println(additions(11,53))
    println(additions.invoke(100,200))

    val sum = calculate(10,20, additions)
    println(sum)

    val subtraction = calculate(100,200, subtraction)
    println(subtraction)

    val multiply = calculate(4,7){a,b -> a * b}
    println(multiply)

    val division = calculate(10,3,::division)
    println(division)
}