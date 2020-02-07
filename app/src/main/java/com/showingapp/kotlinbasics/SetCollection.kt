package com.showingapp.kotlinbasics

//doesnt maintain order
//wont contain duplicates

fun main(args : Array<String>) {
    val set = mutableSetOf("abc", "xyz", "mno")
    println(set)

    set.add("purple")
    set.remove("abc") //order is not maintained....so cant remove by element

    val list = set.toMutableList()

    list.removeAt(2)

    list.add("dup")
    list.add("dup")

    println(list)

    val newSet = list.toMutableSet()

    println(newSet)

    //set will not have duplicate values

    val customSet = mutableSetOf<ClothingItem>()

    customSet.add(ClothingItem("Shirt", "L", 23.4))



}