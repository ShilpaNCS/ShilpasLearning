package com.showingapp.kotlinbasics

fun main(args : Array<String>) {

    val buster = Retriever()
    makeATalk(buster)
    reportBean("Buster", buster)
}

fun makeATalk(dog : Retriever) {
    dog.speak()
}

fun reportBean(name:    String , dog: Dog) {
    println("$name is a ${dog::class.simpleName}")
    println("This dogs fur is ${dog.fur}")
}

interface Dog{
    var fur: String
    fun speak() {
        println("bark")
    }
}

interface Cat{
    var fur: String
    fun speak() {
        println("Meow")
    }
}

class Retriever : Dog, Cat {
    override var fur: String
        get() = "golden"
        set(value) {}

    override fun speak() {
       // println("Woof")
        super<Dog>.speak() //diamond operator
    }
}