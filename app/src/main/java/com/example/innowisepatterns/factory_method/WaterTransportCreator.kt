package com.example.innowisepatterns.factory_method

class WaterTransportCreator : Creator() {

    override fun createTransport(country: String): Transport {
        val companyName = "WaterTransportCompany"
        val maxLoadCapacity = 1000.0
        val maxCargoDimension = 10.0
        val transportType = getWaterTransportType(country)

        return WaterTransport(transportType, companyName, maxLoadCapacity, maxCargoDimension)
    }

    private fun getWaterTransportType(country: String): String {
        return when (country) {
            "Russia" -> "River"
            else -> "Sea"
        }
    }

}