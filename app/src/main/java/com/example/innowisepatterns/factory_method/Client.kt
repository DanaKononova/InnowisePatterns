package com.example.innowisepatterns.factory_method

fun main() {
    val country = readln()

    val creator: Creator = when (country) {
        "USA" -> AviaTransportCreator()
        "Russia" -> RailTransportCreator()
        "Germany" -> WaterTransportCreator()
        "Belarus" -> AutoTransportCreator()
        else -> AviaTransportCreator()
    }

    val transport = creator.createTransport(country)
    transport.deliverCargo()
}