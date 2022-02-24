package com.example.network

data class ResultObject <out T>(val status: Status, val data: T?, val message: String?) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    companion object {
        fun <T> success(data: T): ResultObject<T> {
            return ResultObject(Status.SUCCESS, data, null)
        }

        fun <T> error(message: String, data: T? = null): ResultObject<T> {
            return ResultObject(Status.ERROR, data, message)
        }

        fun <T> loading(data: T? = null): ResultObject<T> {
            return ResultObject(Status.LOADING, data, null)
        }
    }
}