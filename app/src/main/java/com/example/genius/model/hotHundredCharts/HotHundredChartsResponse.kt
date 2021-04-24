package com.example.genius.model.hotHundredCharts

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class HotHundredChartsResponse(
    val content: Content?,
    val info: Info?
) : Parcelable