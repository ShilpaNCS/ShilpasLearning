package com.showingapp.kotlinbasics

val myName = "Shilpa"

class MainClass {

}

class secondClass {

}

fun main(args: Array<String>) {
    println("Welcome to kotlin training, ${args[0]}")

    var num : Int? = 3

    var flo : Float

    flo = 2.toFloat()

    val classObj = MainClass()

    num = null
    println("Num is $num")
    println("Float is $flo")
    println("MyName is $myName")
    println("Class Object $classObj")
}