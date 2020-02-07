package com.showingapp.kotlinbasics

fun main(args:Array<String>) {

    val colorMap = mapOf(
        Pair("Red", 23),
        Pair("Green", 32)
    )

    println(colorMap)

    println(colorMap::class.simpleName) //LInkedHashMap

    val dynMap = mutableMapOf<String, String>()
    dynMap.put("Shilpa", "Bharath")
    dynMap.put("Romeo", "Juliet")

    println(dynMap)

    println("************************")

    for(ele in dynMap) {
        println(dynMap)
    }

    for(ele in dynMap.keys) {
        println(" $ele is married to ${dynMap.get(ele)}")
    }

    for((key,value) in dynMap) {
        println(" $key is married to $value")
    }

    val cart = mutableMapOf<ClothingItem, Int>()

    cart.put(ClothingItem("Tie", "L", 14.99), 2)
    cart.put(ClothingItem("Shirt", "M", 19.99), 4)
    cart.put(ClothingItem("Socks", "M", 24.00), 1)

    var total: Double = 0.0
    for ((key, value) in cart) {
        val curr = key.price * value
        println("Item ${key.type} @ ${key.price} = $curr")
        total += curr
    }

    println("Total = $total")



}