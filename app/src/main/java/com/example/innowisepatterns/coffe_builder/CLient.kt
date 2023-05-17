package com.example.innowisepatterns.coffe_builder

fun main() {
    val builder: Builder = CoffeeBuilder()
    val director = Director(builder)

    val coffeeWithMilkAndSugar = director.makeCoffeeWithMilkAndSugar()
    coffeeWithMilkAndSugar.showComponents()

    val doubleCoffeeWithCream = director.makeDoubleCoffeeWithCream()
    doubleCoffeeWithCream.showComponents()
}