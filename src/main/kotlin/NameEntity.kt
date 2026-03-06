package com.jetbrains.demo

data class NameEntity(
    val age: Int,
    val lastName: String,
    val firstName: String
) {
    val fullName: String
        get() = "$firstName $lastName"
}

fun returnName(): NameEntity{
    val name = NameEntity(lastName = "John", firstName = "Doe", age = 30)
    return name;
}

fun main() {
    var (firstName, lastName, age) = returnName()
    println("$firstName $lastName is $age years old")
}