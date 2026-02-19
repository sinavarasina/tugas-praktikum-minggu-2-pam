package com.example.tugas_praktikum_minggu_2_pam

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}