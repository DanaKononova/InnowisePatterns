package com.example.innowisepatterns.observer

class Screen(private val name: String) {

    fun update(temperature: Int) {
        println("$name: Temperature is $temperature")
    }

    fun open() {
        val weatherObserver = WeatherObserver
        weatherObserver.subscribe(this)
        println("$name: Opened")
    }

    fun close() {
        val weatherObserver = WeatherObserver
        weatherObserver.unfollow(this)
        println("$name: Closed")
    }

}