package com.example.innowisepatterns.factory_method

class AutoTransport(
    override val companyName: String,
    override val maxLoadCapacity: Double,
    override val maxCargoDimension: Double
) : Transport {

    override fun deliverCargo() {
        println("Delivering cargo by auto transport")
    }

}