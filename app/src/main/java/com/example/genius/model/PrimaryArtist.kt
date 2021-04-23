package com.example.genius.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PrimaryArtist(
    val api_path: String?, // /artists/1421
    val header_image_url: String?, // https://images.genius.com/f3a1149475f2406582e3531041680a3c.1000x800x1.jpg
    val id: Int?, // 1421
    val image_url: String?, // https://images.genius.com/25d8a9c93ab97e9e6d5d1d9d36e64a53.1000x1000x1.jpg
    val iq: Int?, // 46036
    val is_meme_verified: Boolean?, // true
    val is_verified: Boolean?, // true
    val name: String?, // Kendrick Lamar
    val url: String? // https://genius.com/artists/Kendrick-lamar
): Parcelable