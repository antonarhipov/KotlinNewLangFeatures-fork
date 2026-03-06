package com.jetbrains.demo

//    Hiding collection mutability
class UserRegistry {
    // Private mutable implementation
    private val _users = mutableListOf<String>()

    // Public read-only API
    val users: List<String>
        get() = _users

    fun register(user: String) {
        _users += user
    }

    fun remove(user: String) {
        _users -= user
    }

    fun clearAll() {
        _users.clear()
    }
}


fun main() {
println("Collection Example ")
    val registry = UserRegistry()

    registry.register("Alice")
    registry.register("Bob")

    println(registry.users)
}