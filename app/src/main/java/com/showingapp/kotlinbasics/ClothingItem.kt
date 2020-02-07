package com.showingapp.kotlinbasics

data class ClothingItem(
    private var _type: String?,
    val size:String,
    private var price_:Double) {//primary constructor
   /* init {
    _type = _type?.toUpperCase() ?: "UNKNOWN"
}*/


    var type :String? = _type
    //val sample:String = "Hello"
    get() = field ?: "UNKNOWN"

    var price  = price_
    set(value) {
        field = value * 0.9
    }

    constructor(size :String, price : Double): this(null, size, price) //primary constructor shd be called via this
        //implementation code can be added here

}