package com.showingapp.kotlinbasics

fun main(args:Array<String>) {
    val myString : String? = null
    val len :Int? = myString?.length

    println(len)

    val result:Int = len ?: -1

    println("Result is $result")

    try {
        val notNull = myString !!
        println(notNull)
    } catch (e : Exception) {

    }


}