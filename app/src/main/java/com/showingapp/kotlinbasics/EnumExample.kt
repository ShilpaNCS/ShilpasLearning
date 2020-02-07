package com.showingapp.kotlinbasics

enum class EnumExample(val r : Int, val g :Int, val b : Int) {
    RED(255,0,0), GREEN(0,255,0);

    fun rgb() = (r * 256 + g) *256
}

fun testEnum(enum: EnumExample) = when(enum) {
    EnumExample.RED -> "Red"
    EnumExample.GREEN -> "Green"
}

fun mix(c1 : EnumExample , c2 : EnumExample) = when(setOf(c1, c2)) {
    setOf(EnumExample.RED, EnumExample.GREEN) -> "Red+Green"
    else -> "Nothing"
}

fun main(args : Array<String>) {
    println(testEnum(EnumExample.GREEN))
    println(mix(EnumExample.GREEN,EnumExample.RED))
}