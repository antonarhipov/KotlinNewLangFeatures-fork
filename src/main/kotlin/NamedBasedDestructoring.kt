package com.jetbrains.demo

// ------------------------------
// 1️⃣ Positional destructuring on List
// → WEAK WARNING expected
// ------------------------------


class User(
    val name: String,
    val email: String,
    val age: Int
) {
    operator fun component1() = name
    operator fun component2() = email
    operator fun component3() = age
}

fun main() {
    val user = User("Alice", "alice@example.com", 30)

    val (age, name, email) = user

    println("age=$age, name=$name, email=$email")
}
