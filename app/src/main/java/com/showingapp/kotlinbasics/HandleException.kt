package com.showingapp.kotlinbasics

import java.lang.Exception
import java.lang.NumberFormatException

fun main(args:Array<String>) {

    try{
        println("Enter value--")
        val value : String? = readLine()
        val dob : Double = value!!.toDouble()
    } catch (e: KotlinNullPointerException) {
        println("Value was null")
    } catch (e: NumberFormatException) {
        println("{${e.message} is not a number")
    }
}