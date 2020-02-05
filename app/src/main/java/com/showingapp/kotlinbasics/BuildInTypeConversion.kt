package com.showingapp.kotlinbasics

fun main(args : Array<String>) {

    var myInt:Int =3

    var myLong:Long = myInt.toLong()

    var value = 34.5

    println("The type of myLong is ${myLong::class.simpleName}")

    val num1 = 34
    val num2 = 35

    var match:Boolean = (num1 == num2)

    println("Match = $match")

    val match2 = num1.equals(num2)// see bytecode generator Integer.valueOf(num1).equals(Integer.valueOf(num2)

    println("Match2 = $match2")

    println("Compare ${num1.compareTo(num2)}") // num1 is lesser than num2 is negative
    }