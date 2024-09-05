package com.example.basic

const val PI = 3.14 //for values that are already known at compile time or not computed. and also similiar to java static final
//const val PI = getPi()---> error
val pi = getPi()

fun getPi(): Double = 3.14

fun main(args: Array<String>) {
    //type inference
    var name = "John"
    var age = 35

    // val vs var
    var currency = "Euro" //mutable
    currency = "Dollar"

    val nationality = "USA" //readonly
    //nationality = "UK" --> error
}