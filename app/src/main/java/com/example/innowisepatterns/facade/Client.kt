package com.example.innowisepatterns.facade

fun main() {
    val userManager = UserManager()
    val userData = userManager.getUserData()
    println(userData)
}