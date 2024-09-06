package com.example.basic

import kotlin.math.*

fun main(args: Array<String>) {
    val num1 = 10
    val num2 = 3

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 / $num2 = ${num1 / num2}")
    println("$num1 * $num2 = ${num1 * num2}")
    println("$num1 % $num2 = ${num1 % num2}")

    //from the math package
    println("PI: ${kotlin.math.PI}")
    println("|-30| = ${kotlin.math.abs(-30)}")
    println("cos(180) = ${kotlin.math.cos(PI)}")
    println("max(5, 3) = ${max(5, 3)}")
    println("round(2.238) ~ ${round(2.238)}")
    println("ceil(2.238) ~ ${ceil(2.238)}")
    println("floor(2.238) ~ ${floor(2.238)}")

    //++ or -- operators
    var number = 10;
    println(++number)
    println(number--)
    println(number)
}