package com.example.innowisepatterns.facade

//Facade class
class UserManager {

    private val cacheManager: CacheManager = CacheManager()
    private val apiManager: ApiManager = ApiManager()

    fun getUserData(): UserData {
        val cachedData = cacheManager.getCachedUserData()
        if (cachedData != null) return cachedData

        val apiData = apiManager.getUserDataFromApi()
        cacheManager.serCacheUserData(apiData)

        return apiData
    }

}