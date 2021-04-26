package com.example.genius.repo

import com.example.genius.model.geniusSearch.GeniusSearchResponse
import com.example.genius.model.hotHundredCharts.HotHundredChartsResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface GeniusSearchAndHotHundredService {


    @GET("search/")
//Create Header to get API Key, value pair
    suspend fun getGeniusSearchService(@Query("q") artistName: String,
                                       @Header("x-rapidapi-key") key: String): GeniusSearchResponse

    @GET("hot-100/")
    suspend fun getHotHundredChartService(@Query("date") date:String,
                                          @Query("range") range:String,
                                          @Header("x-rapidapi-key") key: String): HotHundredChartsResponse
}