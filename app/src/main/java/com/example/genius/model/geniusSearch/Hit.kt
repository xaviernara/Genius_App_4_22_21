package com.example.genius.model.geniusSearch

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Hit(
    val highlights: @RawValue() List<Any>?,
    val index: String?, // song
    val result: Result?,
    val type: String? // song
):Parcelable