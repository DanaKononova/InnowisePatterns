package com.example.innowisepatterns.facade

class CacheManager {

    private var cachedUserData: UserData? = null

    fun getCachedUserData(): UserData? {
        return cachedUserData
    }

    fun serCacheUserData(userData: UserData) {
        cachedUserData = userData
    }

}