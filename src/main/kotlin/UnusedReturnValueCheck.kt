package com.jetbrains.demo

fun main() {
    println(formatGreeting("John"))
}

fun formatGreeting(name: String): String {
    if (name.isBlank()) return "Hello, anonymous user!"
    if (!name.contains(' ')) {
       "Hello, ${name.replaceFirstChar { it.uppercase() }}!"
    }
    val (firstName :String , lastName :String ) = name.split(' ')
    return "Hello, $firstName! Or should I call you Dr. $lastName?"
}

