package com.example.genius.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hit(
    val highlights: List<Any>?,
    val index: String?, // song
    val result: Result?,
    val type: String? // song
):Parcelable