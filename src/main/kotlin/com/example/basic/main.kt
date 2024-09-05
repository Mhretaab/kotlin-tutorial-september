package com.example.basic

fun main(args: Array<String>) {
    val name = "Maxwell"

    //String functions and properties
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())
    println(name[0])
    println(name[6])
    println("Name is empty: " + name.isEmpty())
    println("Empty is empty: " + "".isEmpty())
    println("Empty is blank: " + "".isBlank())
    println("Blank is empty: " + " ".isEmpty())
    println("Blank is blank: " + " ".isBlank())

    //String template or interpolation
    val age = 30
    val msg = "${name} is ${age} years old"
    println(msg)

    //multi-line string

    val email = """
        
        Hello Maxwell,
        
        I hope you are doing good. Here are the PL you need to stud
            - Kotlin
            - Java
            - Python
        Best regards
    """.trimIndent()

    println(email)

    val formatted_email = """
        
        Hello ${name},
        
        I hope you are doing good. Here are the PL you need to stud
            - %s
            - %s
            - %s
        Best regards
    """.trimIndent()

    println(formatted_email.format("Kotlin", "Java", "Python"))

    //String comparison
    //== for comparison by value
    //=== for comparison reference
    val name1 = "Kebede" //makes use of string pool
    val name2 = "Samson"
    val name3 = "Kebede"
    val name4 = String("Kebede".toCharArray()) //new string is created in the heap

    println(name1 == name2)
    println(name1.equals(name2))

    println(name1 == name3)
    println(name1.equals(name3))
}