package com.jetbrains.demo.utils

object DB {
    fun insert(login: String): Boolean {
        println("Inserting user: $login")
        return false
    }
}

class DatabaseException(message: String) : Exception(message)

fun CancelWholeOrderOperation(){

}