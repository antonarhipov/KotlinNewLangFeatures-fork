package com.jetbrains.demo

import com.jetbrains.demo.utils.DB
import com.jetbrains.demo.utils.DatabaseException

fun createUser(login: String): Result<Unit> =
    if (DB.insert(login))
        Result.success(Unit)
    else
        Result.failure(DatabaseException("User $login cannot be created"))

fun createRoute() {
    createUser("John")  // Is there a problem?
}

fun main() {
    createRoute()
    println("Program finished without showing any error!") // no exception seen
}
