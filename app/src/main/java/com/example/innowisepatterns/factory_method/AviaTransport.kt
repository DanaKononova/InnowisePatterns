package com.example.innowisepatterns.factory_method

class AviaTransport(
    private val flightType: String,
    private val transportType: String,
    override val companyName: String,
    override val maxLoadCapacity: Double,
    override val maxCargoDimension: Double
) : Transport {

    override fun deliverCargo() {
        println("Delivering cargo by $flightType $transportType avia transport")
    }

}