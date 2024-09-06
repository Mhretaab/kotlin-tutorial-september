package com.example.basic

import java.math.MathContext

fun main(args: Array<String>) {
    val number = "10"

    println(10 + number.toInt())
    println(10.toString() + number)

    val d = 10.5
    println(d.toFloat())
    println(d.toInt())
    println(d.toBigDecimal(MathContext(2)))
    println(d.toBits())
    println(d.toUInt())
}