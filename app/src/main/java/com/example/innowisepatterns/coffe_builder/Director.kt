package com.example.innowisepatterns.coffe_builder

class Director(private val builder: Builder) {

    fun makeCoffeeWithMilkAndSugar(): Coffee {
        return builder
            .reset()
            .addCoffee()
            .addMilk()
            .addSugar()
            .build()
    }

    fun makeDoubleCoffeeWithCream(): Coffee {
        return builder
            .reset()
            .addDoubleCoffee()
            .addCream()
            .build()
    }

}