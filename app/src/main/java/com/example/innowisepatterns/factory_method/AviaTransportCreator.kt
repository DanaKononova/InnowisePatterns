package com.example.innowisepatterns.factory_method

class AviaTransportCreator : Creator() {
    override fun createTransport(country: String): Transport {
        val companyName = "AirTransportCompany"
        val maxLoadCapacity = 500.0
        val maxCargoDimension = 5.0
        val flightType = getFlightType(country)
        val transportType = getTransportType(country)

        return AviaTransport(flightType, transportType, companyName, maxLoadCapacity, maxCargoDimension)
    }

    private fun getFlightType(country: String): String {
        return when (country) {
            "USA" -> "Domestic"
            "Russia" -> "International"
            else -> "Intercontinental"
        }
    }

    private fun getTransportType(country: String): String {
        return when (country) {
            "USA" -> "Passenger"
            else -> "Cargo"
        }
    }

}