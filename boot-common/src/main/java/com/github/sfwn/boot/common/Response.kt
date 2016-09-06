package com.github.sfwn.boot.common

/**
 * Created by sfwn on 9/5/16.
 */
data class Response<out T>(val data: T?, val errorMsg: String?) {
    companion object {
        fun <T> ok(data: T? = null): Response<T> {
            return Response(data, null)
        }

        fun <T> fail(errorMsg: String): Response<T> {
            return Response(null, errorMsg)
        }
    }
}