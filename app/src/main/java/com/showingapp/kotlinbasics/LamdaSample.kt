package com.showingapp.kotlinbasics
//Lamdba let us call functions as objects and pass parameters to functions

fun main(args : Array<String>) {
    val helloWorld:()->Unit = {
        println("Hello World")
    }

    helloWorld()
    helloWorld.invoke()


    val sayHello:(String,Int?) -> Unit = {
        user: String, age: Int? -> println("Hello, $user")
    }

    sayHello("Shilpa", 0)

    val state:Array<String> = arrayOf("karnataka","kerala","Andrapradesh")

    //val sorted = state.sortedBy { state -> state.length}

    val sorted = state.sortedBy { it.length}
        .filter { it.startsWith("n", true) }

    for(state in sorted) {
        println(state)
    }
}