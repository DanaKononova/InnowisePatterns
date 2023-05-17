package com.example.innowisepatterns.factory_method

class AutoTransportCreator : Creator() {

    override fun createTransport(country: String): Transport {
        val companyName = "RoadTransportCompany"
        val maxLoadCapacity = 1000.0
        val maxCargoDimension = 10.0

        return AutoTransport(companyName, maxLoadCapacity, maxCargoDimension)
    }

}