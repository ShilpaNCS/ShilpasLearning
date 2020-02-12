package com.showingapp.kotlinbasics

fun main(args : Array<String>) {

    val stateful = StateFullListener(object : ClickListener {
        override fun onClick(event: ClickEvent) {
           println("Click at ${event.x} ${event.y}")
        }
    })

    println("Listener Initialized")
    stateful.clickMe(2,3)
    stateful.clickMe(23,45)
}

class ClickEvent(val x: Int, val y: Int)

interface ClickListener{
    fun onClick(event: ClickEvent)
}

class StateFullListener(clickListener: ClickListener) {
    private var _clickListener: ClickListener? = clickListener

    fun clickMe(x: Int, y: Int) {
        _clickListener?.onClick(ClickEvent(x,y))
    }
}