package com.showingapp.kotlinbasics

import java.lang.StringBuilder

fun main(args: Array<String>) {
    val empty = String()// cant pass constructor value

    println("'$empty'")

    var charArray: CharArray = "Hello".toCharArray()

    println("Array is : ${charArray.toList()}")
    println("ByteArray : ${"Hello".toByteArray().toList()}")

    val myString = "Shilpa"
    val len = myString.length

    for (i in 0 until  len) {
        println(myString.get(i))
    }

    val p = myString.indexOf("S")

    val sub:String = myString.substring(p)

    println(sub)

    val string2 = myString

    val match = myString.equals(string2, true)// ignoreCase

    val builder = StringBuilder("Welcome to Kotlin training\n")
        .append("Hope you like the course")

    val result = builder.toString()

    println(result)
}
