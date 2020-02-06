package com.showingapp.kotlinbasics

class MathLib {

    var runningTotal = 0.0

    fun addvalues (num : Double) {
        runningTotal += num
    }

    companion object{
        fun addVales(num1:Double, num2:Double) = num1 + num2
        fun getInput(prompt: String): Double? {
            print(prompt)
            val num1: String? = readLine()
            val n1 = num1!!.toBigDecimal()
            return n1.toDouble()
        }
    }
}