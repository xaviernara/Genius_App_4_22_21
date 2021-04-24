package com.example.genius.model.hotHundredCharts


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class X2(
    val artist: String?, // Polo G
    val detail: String?, // new
    val lastWeek: String?, // None
    val peakPosition: String?, // 1
    val rank: String?, // 1
    val title: String?, // Rapstar
    val weeksAtNo1: String?, // 1
    val weeksOnChart: String? // 1
) : Parcelable