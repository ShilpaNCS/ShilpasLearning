package com.showingapp.kotlinbasics

data class Person1(val name : String, val age : Int? = null)

fun main(args:Array<String>) {
    val personArr = listOf(Person1("shilpa", 28), Person1("NotA Man"))

    val maxAge = personArr.maxBy { it.age ?: 0}

    println("MaxAge : $maxAge")
}