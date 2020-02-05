package com.showingapp.kotlinbasics

fun main(args : Array<String>) {
    var num1 = 30
    var num2 = 43

    val sum = num1.plus(num2)

    println("sum= $sum")

    num1++

    val num3 = num1.inc()//added to a temp variable,..it does not affect the onw which is called

//plus, minus, times, div, rem
}