package com.showingapp.kotlinbasics

fun main(args : Array<String>) {
    val arr = arrayOf(1,2,3,4)

    for( e in arr) {
        println(e)
    }

    val mixed = arrayOf(1,2,3,"Shilpa")
    for(e in mixed) {
        println(e)
    }

    val nulls = arrayOfNulls<String>(3)

    nulls[0] = "red"
    nulls[1] = "blue"

    nulls.set(2,"green")

    for (e in nulls) {
        println(e)
    }

    val intArray = intArrayOf(2,3,4)

    nulls.sort()
    println("Sorting:")
    for (e in nulls) {
        println(e)
    }

}