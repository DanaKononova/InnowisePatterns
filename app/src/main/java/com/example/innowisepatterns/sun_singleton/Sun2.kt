package com.example.innowisepatterns.sun_singleton

class Sun2 private constructor() {

    companion object {
        private var instance: Sun2? = null

        fun getInstance(): Sun2 {
            if (instance == null) {
                synchronized(Sun::class.java) {
                    if (instance == null) {
                        instance = Sun2()
                    }
                }
            }
            return instance!!
        }
    }

    fun makeSunBright(){
        println("Sunny day!!! Sun2 is bright")
    }

}