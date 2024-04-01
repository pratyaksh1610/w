package com.pratyakshkhurana.weatherapp.Api

import com.pratyakshkhurana.weatherapp.DataClass.CurrentWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("/data/2.5/weather")
    suspend fun getCurrentWeather(
        @Query("q") q: String,
        @Query("appId") appID: String,
    ): Response<CurrentWeather>
}
