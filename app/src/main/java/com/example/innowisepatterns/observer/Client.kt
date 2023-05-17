package com.example.innowisepatterns.observer

fun main() {
    val screen1 = Screen("Screen 1")
    val screen2 = Screen("Screen 2")
    val screen3 = Screen("Screen 3")

    screen1.open()
    screen2.open()
    screen3.open()

    WeatherObserver.startUpdatingWeather()

    Thread.sleep(15000)
    screen1.close()

    Thread.sleep(10000)
    screen2.close()

    Thread.sleep(15000)
    screen3.close()
}