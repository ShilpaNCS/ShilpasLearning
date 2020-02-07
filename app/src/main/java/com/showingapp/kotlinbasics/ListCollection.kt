package com.showingapp.kotlinbasics

//maintains the order
//But can contain duplicates

fun main(args:Array<String>) {

    val list = listOf<Any>(1,2,3,"Shilpa")
    println(list)

    println("Size is ${list.size}")

    val mutList = mutableListOf(1,2) //it is ordered

    mutList.add(9)
    println(mutList)

    println(mutList::class.simpleName)

    mutList.sort()

    println(mutList)

    mutList.removeAt(2)
    mutList.remove(5)

    println(mutList)


}