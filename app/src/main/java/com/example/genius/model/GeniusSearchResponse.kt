package com.example.genius.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GeniusSearchResponse(
    val meta: Meta?,
    val response: Response?
):Parcelable