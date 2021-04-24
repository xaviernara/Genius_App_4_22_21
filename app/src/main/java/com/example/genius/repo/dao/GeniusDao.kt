package com.example.genius.repo.dao

import androidx.room.*
import com.example.genius.model.GeniusSearchResponse
import kotlinx.coroutines.flow.Flow


@Dao
interface GeniusDao {

    @Query("Select * FROM  Genius_Search_Response_Table")
    fun selectAllGeniusSearchResponses(): Flow<List<GeniusSearchResponse>>

    @Insert(onConflict =  OnConflictStrategy.IGNORE)
    suspend fun insertGeniusSearchResponses(geniusSearchResponse: GeniusSearchResponse)

    @Update
    suspend fun updateGeniusSearchResponses(geniusSearchResponse:GeniusSearchResponse)

    @Delete
    suspend fun deleteGeniusSearchResponses(geniusSearchResponse: GeniusSearchResponse)





}