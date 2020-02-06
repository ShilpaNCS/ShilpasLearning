package com.showingapp.kotlinbasics
import com.showingapp.kotlinbasics.Operations.*

fun main(args:Array<String>) {
    val n1: Double? = MathLib.getInput("Number 1 :")

    val n2: Double? = MathLib.getInput("Number 2 :")

    print("Select an operation (+ - / *): ")
    val op = readLine()
    var res :Double = 0.0
    try {
        when(op) {
            ADD.operator -> res = MathLib.addVales(n1!!,n2!!)
            SUBTRACT.operator -> res = n1!!.minus(n2!!.toDouble())
            MULTIPLY.operator -> res = n1!!.times(n2!!.toDouble())
            DIVIDE.operator -> res = n1!!.div(n2!!.toDouble())
            else ->
                println("Invalid operation")
        }
    } catch (e: Exception) {
        println("Exception caught")
    }

    println("The answer is $res")




}

