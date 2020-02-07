package com.showingapp.kotlinbasics

import java.util.Random

class KotlinToJava(var isMarried : Boolean, val age :Int)

class RectangleClass(val width : Int, val height : Int) {
    val isSquare :Boolean
    get() = height == width
}

fun createRectangle():RectangleClass {
    val rand = Random();
    return RectangleClass(rand.nextInt(),rand.nextInt())
}

fun main(args:Array<String>) {
    println(EnumExample.RED.rgb())
}