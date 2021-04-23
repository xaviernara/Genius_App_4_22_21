package com.example.genius.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(
    val hits: List<Hit>?
): Parcelable