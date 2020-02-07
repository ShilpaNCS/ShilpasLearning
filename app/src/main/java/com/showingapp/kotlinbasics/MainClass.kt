package com.showingapp.kotlinbasics

import java.text.NumberFormat
import java.util.*

fun main(args: Array<String>) {
    val cloth = ClothingItem("Shirt", "L", 45.67)
    println(cloth)

    val item2 = ClothingItem("L",23.4)
    println(item2)

    val type = item2.type
    println(type)

    item2.price = 10.0
    val f = "%.4f"

    println("Item2 price ${f.format(item2.price)}")

    val person = Person("Shilpa", "NC")

    println(person.fullName)

    Locale.setDefault(Locale.FRANCE)
    val formatter = NumberFormat.getCurrencyInstance()
    println("Item2 price ${formatter.format(item2.price)}")

}