package com.example.genius.repo.local

import androidx.room.TypeConverter
import com.example.genius.model.geniusSearch.Meta
import com.example.genius.model.geniusSearch.Response
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

class Converters {

    //Converter for Result object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun resultsToString(response: Response): String {
        val type = Types.newParameterizedType(Result::class.java)
        val adapter = Moshi.Builder().build().adapter<Response>(type)
        return adapter.toJson(response)
    }

    //Converter for String to Result object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToResult(jsonString: String): Response? {
        val type = Types.newParameterizedType(Result::class.java)
        val adapter = Moshi.Builder().build().adapter<Response>(type)
        return adapter.fromJson(jsonString)
    }

    //Converter for Result object to String
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun metaToString(meta: Meta): String {
        val type = Types.newParameterizedType(Meta::class.java)
        val adapter = Moshi.Builder().build().adapter<Meta>(type)
        return adapter.toJson(meta)
    }

    //Converter for String to Result object
    //DONT NEED type variable WHEN CONVERTING A CUSTOM OBJECT TO STRING
    @TypeConverter
    fun stringToMeta(jsonString: String): Meta? {
        val type = Types.newParameterizedType(Meta::class.java)
        val adapter = Moshi.Builder().build().adapter<Meta>(type)
        return adapter.fromJson(jsonString)
    }




}