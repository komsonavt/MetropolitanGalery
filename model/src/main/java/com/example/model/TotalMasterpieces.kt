package com.example.model

import com.google.gson.annotations.SerializedName

data class TotalMasterpieces (
    @SerializedName("total")
    val total: Int,
    @SerializedName("objectIDs")
    val masterpieces: List<Int>
)