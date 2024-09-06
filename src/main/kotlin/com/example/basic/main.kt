package com.example.basic

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    val isAdult = true
    val isMale = false
    val isOrderCompleted: Boolean? = null

    //logical operators
    println("is Adult and Male: ${isAdult && isMale}")
    println("is Adult or Male: ${isAdult || isMale}")

    //if condition
    if (isAdult && isMale) {
        println("Adult and male")
    } else if (isAdult && !isMale) {
        println("Adult and female")
    } else if (!isAdult && isMale) {
        println("not adult and male")
    } else {
        println("not addult and not male")
    }

    //if expression: like ternary operator in java
    val gender = if(isMale) 'M' else 'F'

    val adultAndMale = if(isAdult or isMale) "Adult Male" else ""
    println(adultAndMale)

    //when condition
    val x = 10

    when(x){
        1 -> println("x==1")
        2 -> println("x==2")
        else ->{
            println("x is neither 1 nor 2")
        }
    }

    when {
        x > 0 -> println("x is positive number")
        x < 0 -> println("x is negative number")
        else -> println("x is zero")
    }

    //when expression
    val numberType = when {
        x > 0 -> "Positive"
        x < 0 -> "Negative"
        else -> "Zero"
    }

    println("x is $numberType number")

    val paymentMethod = "VISA Card"

    when(paymentMethod){
        in "VISA Card", "Credit Card" -> {
            println("paying with visa card...")
        }
        else -> {
            throw IllegalArgumentException()
        }
    }
}