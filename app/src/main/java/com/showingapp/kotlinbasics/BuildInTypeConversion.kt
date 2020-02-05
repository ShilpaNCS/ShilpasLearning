package com.showingapp.kotlinbasics

fun main(args : Array<String>) {

    var myInt:Int =3

    var myLong:Long = myInt.toLong()

    println("The type of myLong is ${myLong::class.simpleName}")
}