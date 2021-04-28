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



    private val geniusClient = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        .let { loginInterceptor ->
            OkHttpClient.Builder().addInterceptor(loginInterceptor).build()
        }

    private val hot100Client = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        .let { loginInterceptor ->
            OkHttpClient.Builder().addInterceptor(loginInterceptor).build()
        }

    private val googleNewsClient = HttpLoggingInterceptor()
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
            .client(geniusClient).build()


    }

    @Provides
    @Singleton
    fun providesRefrofitInstanceGoogleNews(): Retrofit {

        return Retrofit.Builder().
        baseUrl("https://google-news1.p.rapidapi.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(hot100Client).build()


    }

@Provides
    @Singleton
    fun providesRefrofitInstanceHotHundred(): Retrofit {

        return Retrofit.Builder().
        baseUrl("https://billboard-api2.p.rapidapi.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(googleNewsClient).build()


    }





}