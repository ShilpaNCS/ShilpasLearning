package com.showingapp.kotlinbasics

//data class cant be extended

fun main(args:Array<String>) {

    val x : Any = Any()
    println(x)

    val sup =SuperClass(1)
    println(sup)

    val sub = SubClass(1)
    println(sub)

    println(sub.multiply(4))
}

open class SuperClass(anInt : Int) {
    protected val _anInt =anInt

    override fun toString(): String {
        //return "SuperClass Int: $_anInt"
        return "${this::class.simpleName} $_anInt"
    }

    open fun multiply(factor : Int ): Int {
        return _anInt * factor
    }
}

class SubClass(anInt: Int) : SuperClass(anInt) {

    override fun multiply(factor: Int): Int {
        return super.multiply(factor) * factor
    }
}