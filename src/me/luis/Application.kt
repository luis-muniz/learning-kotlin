package me.luis

// function main is first call in the compilation
fun main():Unit{
   // learning variables
//   variable()

    // learning conditional
//    conditional()

    //learning loops
//    loop()

    // learning functions
//    functions()

    // learning class
    val person = Person("luis fernando", 1997)
    println(person.age)

    val circle = Circle(10.2)
    circle.printArea()

    val rectangle = Rectangle(100.0,50.0)
    rectangle.printArea()

    val square = Square(20.0)
    square.printArea()


    val cat = Cat();
    cat.doSound()

    val dog = Dog()
    dog.doSound()
}

fun variable(){
    //1. mutable variable
    var old = 18
    old = 23
    println(old)

    //2. immutable variable
    val name = "luis fernando"
    //name = "luis" <- Error
    println(name)

    //3. null variable -> use operator ?
    val school: String?
    school = null

    //4. Exception protection
    println(school?.length);

    //5. Elvis operator
    println(school?.length ?: "Empty")

    //6. non-null variable
    val teacher: String = "Prof. Felipe"
    //school = null  <- Error

    //7. concatenation of variables + string
    val pc = "Dell G3"
    println("I have a $pc pc")
}

fun conditional(){

    //1. if/else
    //1.1 simple example
    var old = 18
    if (old <= 15){
        println("You cannot vote")
    }else if (old <= 17 && old >= 60){
        println("You can vote")
    }else{
        println("You must vote")
    }

    //1.2 you can assign a conditional to a variable
    old = 70
    var result: String
    result = if(old <= 15){
        "You cannot vote"
    }else if(old <= 17 && old >= 60){
        "You can vote"
    }else{
        // more lines, the last one is returned
        println("Be yourself")
        "hello brothers"
        "You must vote" //<- returned
    }
    println(result)

    //2. when
    result = when{
        old <= 15 -> "(when)You cannot vote"
        old in 60..17 -> "(when)You can vote"
        else -> "(when)You must vote"
    }
    println(result)
}

fun loop(){

    //1. for
    for (i in 1..10) {
        println(i)
    }
    for (j in 10 downTo  1) {
        println(j)
    }

    //2. while
    var i = 1;
    while (i<10){
        println(i++);
    }

    //3. do while
    i = 1;
    do {
        println(i++);
    }while (i<10)

}

fun functions(){
    var result  = sum(10,20)
    println(result)

    printSum(10,30)

    println(multiply(18,782))

    printMultiply(10,10)

    var average = average(1,2,3,4,5,6,7,8)
    println(average)

    printName()

    printName("Jesus")
}

// function with return
fun sum(a:Int, b: Int): Int{
    return a + b
}

// function without return
fun printSum(a:Int, b: Int): Unit{
    var sum = a + b
    println("$a + $b = $sum")
}

// functions without body
fun multiply(a: Int, b: Int) = a * b
fun printMultiply(a: Int, b: Int) = println(a * b)

// function with many args
fun average(vararg numbers: Int): Float{
    return if (numbers.isNotEmpty()) {
        var sum = numbers.sum();
        sum.toFloat() / numbers.size.toFloat()
    }else
        0F
}

// function with default value
fun printName(name: String = "Luis") = println(name)