package com.example.genius.model.googleEntertainmentNews


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class GoogleEntertainmentNewsResponse(
    val articles: List<Article>?,
    val statusCode: Int? // 200
) : Parcelable