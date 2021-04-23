package com.example.genius.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Result(
    val annotation_count: Int?, // 20
    val api_path: String?, // /songs/3039923
    val full_title: String?, // HUMBLE. by Kendrick Lamar
    val header_image_thumbnail_url: String?, // https://images.genius.com/0780c76f8d3ab762a0ad67ac26fa9709.300x169x1.jpg
    val header_image_url: String?, // https://images.genius.com/0780c76f8d3ab762a0ad67ac26fa9709.1000x563x1.jpg
    val id: Int?, // 3039923
    val lyrics_owner_id: Int?, // 104344
    val lyrics_state: String?, // complete
    val path: String?, // /Kendrick-lamar-humble-lyrics
    val primary_artist: PrimaryArtist?,
    val pyongs_count: Int?, // 1130
    val song_art_image_thumbnail_url: String?, // https://images.genius.com/483306c535608c27f9e3781b854dc91d.300x300x1.png
    val song_art_image_url: String?, // https://images.genius.com/483306c535608c27f9e3781b854dc91d.1000x1000x1.png
    val song_art_primary_color: Any?, // null
    val song_art_secondary_color: Any?, // null
    val song_art_text_color: Any?, // null
    val stats: Stats?,
    val title: String?, // HUMBLE.
    val title_with_featured: String?, // HUMBLE.
    val url: String? // https://genius.com/Kendrick-lamar-humble-lyrics
): Parcelable