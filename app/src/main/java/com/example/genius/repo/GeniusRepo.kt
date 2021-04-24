package com.example.genius.repo

import com.example.genius.model.geniusSearch.GeniusSearchResponse
import com.example.genius.remote.RetrofitInstance
import com.example.genius.repo.dao.GeniusDao
import javax.inject.Inject

class GeniusRepo @Inject constructor(private val geniusDao: GeniusDao, private val retrofitInstance: RetrofitInstance){


 val geniusSearchFlow = geniusDao.selectAllGeniusSearchResponses()

    suspend fun insertGeniusSearchResponses(geniusSearchResponse: GeniusSearchResponse) = geniusDao.insertGeniusSearchResponses(geniusSearchResponse)

    suspend fun deleteGeniusSearchResponses(geniusSearchResponse: GeniusSearchResponse) = geniusDao.deleteGeniusSearchResponses(geniusSearchResponse)

    suspend fun updateGeniusSearchResponses(geniusSearchResponse: GeniusSearchResponse) = geniusDao.updateGeniusSearchResponses(geniusSearchResponse)

    suspend fun createGeniusSearchResponse(artistName: String): GeniusSearchResponse {
        return retrofitInstance.geniusService.getGeniusSearchService(artistName,"1086eabd4emsh9b6930a4c6fbefep1e9dc5jsn5801c00cfa54")
    }
}