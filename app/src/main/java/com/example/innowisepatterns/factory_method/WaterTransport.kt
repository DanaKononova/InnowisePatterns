package com.example.innowisepatterns.factory_method

class WaterTransport(
    private val type: String,
    override val companyName: String,
    override val maxLoadCapacity: Double,
    override val maxCargoDimension: Double
) : Transport {

    override fun deliverCargo() {
        println("Delivering cargo by $type water transport")
    }

}