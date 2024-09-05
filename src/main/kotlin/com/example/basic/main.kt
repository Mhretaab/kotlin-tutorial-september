package com.example.basic

fun main(args: Array<String>) {
    var name: String = "Martha"
    //name = null--->Error

    var brand: String? = null
    println( brand?.uppercase())

    brand = "Nike"
    println( brand?.uppercase())
}