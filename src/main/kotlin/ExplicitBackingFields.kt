package com.jetbrains.demo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CityViewModel {

    // Public API exposes read-only StateFlow
    private val _city = MutableStateFlow<String>(value = "")
    val city: StateFlow<String> get() = _city

    fun updateCity(newCity: String) {
        // Smartcast automatically updates the backing field
        _city.value = newCity
    }
}

fun main() {
    println("StateFlow Example")
    val vm = CityViewModel()
    vm.updateCity("Munich")
    println(vm.city.value)
}