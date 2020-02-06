package com.showingapp.kotlinbasics

import java.lang.Exception
import java.lang.NumberFormatException

fun main(args:Array<String>) {
    try {
        val ins = MathLib()
        while(true) {
            val num = MathLib.getInput("Enter a number")
            ins.addvalues(num!!)
            println("Current total: ${ins.runningTotal}")

        }
    } catch (e :NumberFormatException) {
        println("${e.message} is not a number")
    } catch(e: Exception) {
        println(e.message)
    }
}