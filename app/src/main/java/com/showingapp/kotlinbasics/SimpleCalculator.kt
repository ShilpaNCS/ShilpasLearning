package com.showingapp.kotlinbasics

import android.hardware.biometrics.BiometricPrompt
import androidx.core.text.isDigitsOnly

fun main(args:Array<String>) {
    val n1: Double? = getInput("Number 1 :")

    val n2: Double? = getInput("Number 2 :")

    print("Select an operation (+ - / *): ")
    val op = readLine()
    var res :Double = 0.0
    try {
        when(op) {
            "+" -> res = MathLib.addVales(n1!!,n2!!)
            "-" -> res = n1!!.minus(n2!!.toDouble())
            "*" -> res = n1!!.times(n2!!.toDouble())
            "/" -> res = n1!!.div(n2!!.toDouble())
            else ->
                println("Invalid operation")
        }
    } catch (e: Exception) {
        println("Exception caught")
    }

    println("The answer is $res")




}

private fun getInput(prompt: String): Double? {
    print(prompt)
    val num1: String? = readLine()
    val n1 = num1!!.toDouble()
    return n1
}