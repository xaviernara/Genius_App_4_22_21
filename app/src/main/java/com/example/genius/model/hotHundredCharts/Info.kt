package com.example.genius.model.hotHundredCharts


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



@Parcelize
data class Info(
    val category: String?, // Billboard
    val chart: String?, // HOT 100
    val date: String?, // 2021-04-24
    val source: String? // Billboard-API
) : Parcelable