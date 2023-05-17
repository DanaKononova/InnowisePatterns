package com.example.innowisepatterns.factory_method

class RailTransportCreator : Creator() {

    override fun createTransport(country: String): Transport {
        val companyName = "RailwayTransportCompany"
        val maxLoadCapacity = 2000.0
        val maxCargoDimension = 15.0
        val gaugeSize = getGaugeSize(country)
        val hasBallast = hasBallast(country)

        return RailTransport(gaugeSize, hasBallast, companyName, maxLoadCapacity, maxCargoDimension)
    }

    private fun getGaugeSize(country: String): Int {
        return when (country) {
            "USA" -> 1400
            else -> 1600
        }
    }

    private fun hasBallast(country: String): Boolean {
        return when (country) {
            "USA" -> false
            else -> true
        }
    }

}