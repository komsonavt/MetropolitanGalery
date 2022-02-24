package com.example.network

interface GalleryGetDataSource {
    suspend fun getDepartments()
    suspend fun getAllMasterpieceByDep(departmentId: Int)
    suspend fun getMasterpiece(masterpieceId: Int)
}