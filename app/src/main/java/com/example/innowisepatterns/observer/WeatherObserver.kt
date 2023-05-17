package com.example.innowisepatterns.observer

import java.util.*

object WeatherObserver{
    private val observers = mutableListOf<Screen>()
    private var weatherInfo: Int = 0

    fun update(weatherInfo: Int) {
        this.weatherInfo = weatherInfo
        println("Received weather update: $weatherInfo")
    }

    fun subscribe(screen: Screen){
        observers.add(screen)
    }

    fun unfollow(screen: Screen){
        observers.remove(screen)
    }

    fun startUpdatingWeather() {
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                weatherInfo = calculateTemperature()
                notifyObservers()
            }
        }, 0, 5000)
    }

    private fun calculateTemperature(): Int {
        val currentTime = Date().time
        val interval = currentTime / 1000 % 35
        return interval.toInt()
    }

    private fun notifyObservers() {
        for (observer in observers) {
            observer.update(weatherInfo)
        }
    }

}