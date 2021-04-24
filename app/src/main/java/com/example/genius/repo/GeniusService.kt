package com.example.genius.repo

import com.example.genius.model.GeniusSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface GeniusService {


    @GET("search/")
//Create Header to get API Key, value pair

    suspend fun getGeniusService(@Query("q") artistName: String,
                                 @Header("x-rapidapi-key") key: String):GeniusSearchResponse

}