package com.showingapp.kotlinbasics

fun main(args:Array<String>) {
    println("Enter a name")

    val name = readLine()

     println("Entered name is: $name")

    when(name) {
        "Shilpa" -> println("Is a girl")
        "Bharath" -> println("Is a boy")
        else -> println("Nothing")
    }

    val result = when(name) {
        "Shilpa" -> 0 //if passed value is number....in 1..40 can also be checked
        "Bharath" -> 1
        else -> 2
    }

    println(result)
}