package com.example.genius.model.googleEntertainmentNews


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Source(
    val title: String?, // Variety
    val url: String? // https://variety.com
) : Parcelable