package com.showingapp.kotlinbasics

sealed class SealedClothing(val type: String) {
    abstract val size: String
    abstract val price: Double
}

data class Shirt(override var size: String,
                 override var price: Double): SealedClothing("Shirt")


data class Pants(override var size: String,
                 override var price: Double): SealedClothing("Pants")