package com.example.innowisepatterns.factory_method

abstract class Creator {
    abstract fun createTransport(country: String): Transport

    fun deliverCargo(country: String) {
        val transport = createTransport(country)
        transport.deliverCargo()
    }
}