package com.example.network

import com.example.model.Department
import com.example.model.Masterpiece
import com.example.model.TotalMasterpieces
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface GalleryApi {

    companion object {
        const val ENDPOINT = "https://collectionapi.metmuseum.org/public/collection/v1/"
    }


    @GET("departments")
    suspend fun getDepartments(): Response<List<Department>>

    @GET("objects?departmentIds={id}")
    suspend fun getAllMasterpieceByDep(@Path("id") id: Int) : Response<TotalMasterpieces>

    @GET("objects")
    suspend fun getMasterPiece(@Query("objectID") objectId:Int) : Response<Masterpiece>
}