package com.showingapp.kotlinbasics

data class Person(val name : String, val age : Int? = null)

fun main(args:Array<String>) {
    val personArr = listOf(Person("shilpa", 28), Person("NotA Man"))

    val maxAge = personArr.maxBy { it.age ?: 0}

    println("MaxAge : $maxAge")
}