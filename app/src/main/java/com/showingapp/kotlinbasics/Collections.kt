package com.showingapp.kotlinbasics

fun main(args:Array<String>) {
    val colors = arrayOf("red","green")
    val values = intArrayOf(1,2,3,4)

    for (color in colors) {
        println("Current color $color")
    }

    for (i in values.indices step 2) {
        println(values[i])
    }

    for (i in 0..values.size-1) {
        println(values[i])
    }

    for (i in 0 until values.size) {
        println("Print values " + values[i])
    }
}