package com.example.activity1

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argument
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

//default parameter value
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}