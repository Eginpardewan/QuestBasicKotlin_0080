package com.example.activity1

// Data class
// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    // Fungsi Equals
    val data1 = DataClass(1, "indra@gmail.com")
    println(data1)

    val data2 = DataClass(1, "makan@gmail.com")
    println(data1 == data2) // false

    // Fungsi Copy
    val data3 = data1.copy()
    println(data3)

    // Fungsi Copy dengan perubahan
    val data4 = data1.copy(email = "sahar@gmail.com")
    println(data4)
}