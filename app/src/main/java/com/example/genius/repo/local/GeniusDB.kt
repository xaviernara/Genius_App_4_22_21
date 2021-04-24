package com.example.genius.repo.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.genius.model.geniusSearch.GeniusSearchResponse
import com.example.genius.repo.dao.GeniusDao

@Database(entities = [GeniusSearchResponse::class], version =1)
@TypeConverters(Converters::class)
abstract class GeniusDB : RoomDatabase() {
    abstract fun geniusDao(): GeniusDao
}