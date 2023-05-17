package com.example.innowisepatterns.sun_singleton

//здесь реализованы два способа создания объекта "Солнце" по принципу паттерна Singleton
fun main() {
    val sun = Sun
    sun.makeSunBright()

    val sun2 = Sun2.getInstance()
    sun2.makeSunBright()
}