package com.showingapp.kotlinbasics

fun main(args:Array<String>) {
    val res = max(2,3)
    println("return value $res")

    println("Evaluating expression inside String Template ${if(2 > 3) 2 else 3}")
}

fun max(a :Int, b:Int): Int = if(a >b) a else b