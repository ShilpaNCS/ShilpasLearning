package com.showingapp.kotlinbasics

fun main(args: Array<String>) {
    val num1 = 3.4
    val num2 =4

    addValues(3.4,4.toDouble())
    addValues(param2 = 3.4, param = 8.6)

    val result = calValues(3.9,4.9,"-")

    println(result)

    println(addValues(2,3,4,5,6))
}

fun addValues(param : Double, param2: Double) : Double { //returning Double
    return param + param2
}

fun calValues(param1 : Double, param2 : Double, op : String = "+"):Double {
    if (op.equals("+")) {
        return param1 + param2
    } else if (op.equals("-")) {
        return param1 - param2
    }

    return 0.0
}

fun addValues(vararg numbers : Int) : Int {

    var result = 0

    for (i in numbers ) {
        result += i
    }

    return result
}