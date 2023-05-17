package com.example.innowisepatterns.coffe_builder

class Coffee(private val components: List<String>) {

    fun showComponents() {
        println("Coffee components: ${components.joinToString(", ")}")
    }

}