package com.example.innowisepatterns.factory_method

class RailTransport(
    private val gaugeSize: Int,
    private val hasBallast: Boolean,
    override val companyName: String,
    override val maxLoadCapacity: Double,
    override val maxCargoDimension: Double
) : Transport {

    override fun deliverCargo() {
        println("Delivering cargo by rail transport with gauge size $gaugeSize and ballast: $hasBallast")
    }

}