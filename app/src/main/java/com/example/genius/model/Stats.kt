package com.example.genius.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Stats(
    val concurrents: Int?, // 5
    val hot: Boolean?, // false
    val pageviews: Int?, // 10893343
    val unreviewed_annotations: Int? // 0
): Parcelable