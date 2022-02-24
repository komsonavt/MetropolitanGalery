package com.example.network

import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class GalleryGetDataSourceImpl @Inject constructor(
    private val galleryApi: GalleryApi
    ) : GalleryGetDataSource {

    override suspend fun getDepartments(){
        getResults { galleryApi.getDepartments() }
    }

    override suspend fun getAllMasterpieceByDep(departmentId: Int) {
        getResults { galleryApi.getAllMasterpieceByDep(departmentId) }
    }

    override suspend fun getMasterpiece(masterpieceId: Int) {
        getResults { galleryApi.getMasterPiece(masterpieceId) }
    }

    private suspend fun <T> getResults(call: suspend () -> Response<T>) : ResultObject<T> {
        try {
            val response = call()
            if (response.isSuccessful){
                val body = response.body()
                if (body!=null) return ResultObject.success(body)
            }
            return ResultObject.error("${response.code()} ${response.message()}")

        }catch (e: Exception){
            return error(e.message ?: e.toString())
        }

    }

    private fun <T> error(message: String): ResultObject<T> {
        return ResultObject.error("Network call has failed for a following reason: $message")
    }
}