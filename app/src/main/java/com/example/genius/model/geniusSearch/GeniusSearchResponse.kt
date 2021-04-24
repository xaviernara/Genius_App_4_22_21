package com.example.genius.model.geniusSearch

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Entity(tableName ="Genius_Search_Response_Table")
@JsonClass(generateAdapter = true)
@Parcelize
data class GeniusSearchResponse(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val meta: Meta?,
    val response: Response?
):Parcelable