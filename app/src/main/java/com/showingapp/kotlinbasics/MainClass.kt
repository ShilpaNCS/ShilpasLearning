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

    val item1 = Shirt( "L", 34.5)

    println(item1)

    val item22 = Pants("XL", 45.67)

    println(item22)

    val mostExpensive : SealedClothing =
        if(item1.price > item22.price) item1 else item22

    val instuctions: String = when(mostExpensive) {
        is Shirt -> "Found Shirt"
        is Pants -> "Found Pants"
    }

    println(instuctions)


}