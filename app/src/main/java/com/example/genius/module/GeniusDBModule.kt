package com.example.genius.module

import android.content.Context
import androidx.room.Room
import com.example.genius.repo.dao.GeniusDao
import com.example.genius.repo.local.GeniusDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GeniusDBModule {


    @Provides
    @Singleton
    fun providesDb(@ApplicationContext appContext: Context): GeniusDB =
        Room.databaseBuilder(appContext, GeniusDB::class.java, "GeniusDB")
            .build()


    @Provides
    @Singleton
    fun provideGeniusDao(db: GeniusDB): GeniusDao = db.geniusDao()



    private val client = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        .let { loginInterceptor ->
            OkHttpClient.Builder().addInterceptor(loginInterceptor).build()
        }

    @Provides
    @Singleton
    fun providesRefrofitInstance(): Retrofit {

        return Retrofit.Builder().
        baseUrl("https://genius.p.rapidapi.com/search")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client).build()

    }





}