package com.example.innowisepatterns.factory_method

interface Transport{

    val companyName: String
    val maxLoadCapacity: Double
    val maxCargoDimension: Double

    fun deliverCargo()

}