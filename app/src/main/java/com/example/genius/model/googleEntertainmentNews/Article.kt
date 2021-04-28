package com.example.genius.model.googleEntertainmentNews


import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class Article(
    val link: String?, // https://variety.com/2021/tv/news/tv-ratings-oscars-2021-down-record-low-1234960615/
    val published_date: String?, // 2021-04-26T17:23:00+00:00
    val source: Source?,
    val title: String? // TV Ratings: Oscars Plummet to Record Low, Down 58% Compared to Last Year - Variety
) : Parcelable