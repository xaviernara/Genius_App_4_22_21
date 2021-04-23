package com.example.genius.adaptor

import com.example.genius.model.GeniusSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GeniusService {


    @GET("search/")
    suspend fun getGeniusService(@Query("q") artistName: String):GeniusSearchResponse

}