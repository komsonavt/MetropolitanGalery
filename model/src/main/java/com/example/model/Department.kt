package com.example.model

import com.google.gson.annotations.SerializedName

data class Department (
    @SerializedName("departmentId")
    val id : Int,
    @SerializedName("displayName")
    val title: String
)