package com.showingapp.kotlinbasics

import com.showingapp.kotlinbasics.Constants.Companion.RED

//const val RED = "Red" //memory is saved, no get method is created but is visible only within the class

fun main(args: Array<String>) {

    val myString= "RED"
    val num = 3
    println(num)
    println(myString)
    println("Color is $RED")
}