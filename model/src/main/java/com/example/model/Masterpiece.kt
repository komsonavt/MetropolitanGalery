package com.example.model

import com.google.gson.annotations.SerializedName

data class Masterpiece(
    @SerializedName("objectID")
    val id: Int,
    @SerializedName("accessionYear")
    val accessionYear: String,
    @SerializedName("primaryImage")
    val primaryImage: String,
    @SerializedName("primaryImageSmall")
    val primaryImageSmall: String,
    @SerializedName("department")
    val department: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("culture")
    val culture: String,
    @SerializedName("objectWikidata_URL")
    val wikiData: String,
    @SerializedName("GalleryNumber")
    val GalleryNumber: String
)
