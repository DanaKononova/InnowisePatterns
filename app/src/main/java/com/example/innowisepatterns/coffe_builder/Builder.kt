package com.example.innowisepatterns.coffe_builder

interface Builder {

    fun reset(): Builder

    fun addCoffee(): Builder

    fun addDoubleCoffee(): Builder

    fun addMilk(): Builder

    fun addCream(): Builder

    fun addSugar(): Builder

    fun addCinnamon(): Builder

    fun addSyrup(): Builder

    fun build(): Coffee

}